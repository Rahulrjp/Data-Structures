package Array;

import java.util.*;

public class ParanthesisChecker {
    public static boolean ispar(String x)
    {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='('|| x.charAt(i)=='['|| x.charAt(i)=='{' )
                st.push(x.charAt(i));
            else{
                if(st.isEmpty())return false;
                else if((x.charAt(i)==')' && st.peek()=='(') ||
                        (x.charAt(i)==']' && st.peek()=='[') ||
                        (x.charAt(i)=='}' && st.peek()=='{'))st.pop();

                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        boolean result = ispar(str);
        if (result == true)System.out.println("balanced");
        else System.out.println("not Balanced");
    }
}
