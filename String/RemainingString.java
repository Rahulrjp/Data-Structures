package String;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class RemainingString {
    static String printString(String s, char ch, int count) {
        int n = 0;
        String s1 = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(n < count){
                if(s.charAt(i) == ch){
                    n += 1;
                }
            }
            if(n==count) {
                s1=s1.concat(s.substring(i+1));
                break;
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "Thisisdemostring";
        char ch = 'i';
        int count = 3;
        String result = printString(s,ch,count);
        System.out.println(result);
    }

}
