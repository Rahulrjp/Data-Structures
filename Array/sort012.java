package Array;

import java.lang.reflect.Array;
import java.util.*;

public class sort012 {
    public static void sort012(int a[], int n)
    {
        /* This method is general method to sort an array and it takes more time.

        for(int i = 0 ; i < a.length - 1 ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
         */
        Arrays.sort(a);   //shortcut method to reduce time using sort() method which is imported from java.util.Arrays package
    }

    public static void main(String[] args) {
        int[] arr = {0,2 ,1 ,2 ,0};
        sort012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
