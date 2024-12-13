package Pattern;

/*
1
2 7
3 6 8
4 5 9 10
*/
public class NumberPattern1 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print((count - i) + " ");
                count++;
            }
            System.out.println();
        }

    }
}
