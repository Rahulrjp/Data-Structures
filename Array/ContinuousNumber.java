package Array;

import java.util.ArrayList;

public class ContinuousNumber {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while(sum!=s || sum < s){
            for(int i = 0 ; i < n ; i++){
                sum = sum + arr[i];
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,0,10};
        int n = 10;
        int s = 11;
        ArrayList<Integer> result;
        result = subarraySum(arr,n,s);
        System.out.println(result);
    }

}
