package Pattern;

public class VerticalHollowPiramid {
    static void pattern(char ch){
        for (int i = 0 ; i < 4;i++){
            System.out.println("");
            if (i==3){
                System.out.print("  *");
                break;
            }
            for (int j = 0 ; j < i+1 ; j++){
                if (i!=j){
                    System.out.print("  ");
                }  else {
                    System.out.print(ch);
                }
            }
        }
    }
    public static void main(String[] args) {
        char star = '*';
        pattern(star);
        pattern(star);
        pattern(star);
        System.out.println("\n"+star);
    }
}
