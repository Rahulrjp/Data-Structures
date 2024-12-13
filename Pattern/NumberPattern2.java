package Pattern;

/*
    1
   121
  12321
 1234321
123454321

*/
public class NumberPattern2 {
    static long palindrome(int n){
        long num = 0;
        for(int i = 1 ; i < 2*n ; i++){
            if (i <= n){
                num = (num*10)+i;
            }
            else {
                num = (num*10)+((2*n)-i);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1 ; i<=n ; i++){
            for (int j = i ; j < n ;j++){
                System.out.print(" ");
            }
            System.out.println(palindrome(i));
        }
    }
}