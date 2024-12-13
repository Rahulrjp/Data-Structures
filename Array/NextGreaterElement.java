package Array;

import java.util.Arrays;

public class NextGreaterElement {
    static long[] nextLargerElement(long[] arr, int n)
    {
        long[] result = new long[n];
        for (int i = 0 ; i< n-1 ;i++){
            for (int j = i+1 ; j<n ;j++){
                if (arr[j] > arr[i]){

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr = {1, 3, 2, 4};
        long[] result = nextLargerElement(arr,arr.length);
        System.out.println(result);
    }
}

