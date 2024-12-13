package Pattern;

public class AlphaNumericPattern1 {
    public static void main(String[] args) {
        char letter = 'A';
        int number = 1;
        int n = 5;
        for (int i = 0; i < n;i++){
            for (int j = 0; j<=i ;j++){
                if (i%2==0){
                    System.out.print(letter);
                }
                else {
                    System.out.print(number);
                }
            }
            if (i%2==0){
                letter++;
            }
            else {
                number++;
            }
            System.out.println();
        }
    }
}