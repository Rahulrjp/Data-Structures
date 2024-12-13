package Pattern;

/*
1
2 3
6 5 4
10 9 8 7
 */

import java.util.Arrays;

public class NumberPattern3 {
    static final int x = 5;
    public  final void abc(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        NumberPattern3 obj = new NumberPattern3();
        String str = "Mnakais yVis Rme ahl huwarma ";
        String s = "aaaa";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i < arr.length-1;i++){
            for (int j = i+1; j < arr.length;j++){
                if (arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] =  arr[j];
                    arr[j] =  temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
