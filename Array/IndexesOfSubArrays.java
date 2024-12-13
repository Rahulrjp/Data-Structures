package Array;

import java.util.*;

public class IndexesOfSubArrays {
    static ArrayList<Integer> index(int[] arr, int n, int s) {
        int sum;
        ArrayList<Integer> result = new ArrayList<>();
        /*for (int i = 0; i < n; i++){
            sum = 0;
            for (int j = i;j<n;j++) {
                sum = sum+arr[j];
                if (sum == s){
                    result.add(i+1);
                    result.add(j+1);
                    break;
                }
            }
            if (sum==s){
                break;
            }
        }*/
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int s = 15;
        ArrayList<Integer> result = index(arr, arr.length, s);
        System.out.println(result);
        System.out.println();
    }
}
