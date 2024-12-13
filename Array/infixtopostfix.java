package Array;

import java.util.Stack;

public class infixtopostfix {
    public StringBuffer postfix(StringBuffer str){
        StringBuffer newstr = new StringBuffer();
        Stack<Character> st = new Stack<>();
        st.push('(');
        str.append(')');
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == ')'){
                while (st.peek() != '('){
                    st.pop();
                }
                st.pop();
            }
            if (Character.isLetter(str.charAt(i))){
                newstr.append(str.charAt(i));
            } else if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == '^') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == '*' || str.charAt(i) == '/') {
                if (st.peek() == '^' || st.peek() == '/' || st.peek() == '*' ){
                    while (st.peek() != '(' || st.peek() != '+' || st.peek() != '-'){
                        newstr.append((st.peek()));
                        st.pop();
                    }
                    st.push(str.charAt(i));
                }
            }
            else if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/' || st.peek() == '^'){
                    while (st.peek() != '('){
                        newstr.append((st.peek()));
                        st.pop();
                    }
                    st.push(str.charAt(i));
                }
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        infixtopostfix obj = new infixtopostfix();
        StringBuffer str = new StringBuffer("A+B-C/D*E+F+G/H");
        StringBuffer result = obj.postfix(str);
        System.out.println(result);
    }
}
