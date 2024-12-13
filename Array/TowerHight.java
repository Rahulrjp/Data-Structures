package Array;

import java.util.Arrays;

public class TowerHight {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int mini , maxi;
        for(int i=1; i<n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            maxi = Math.max(arr[i-1]+k,arr[n-1]-k);
            mini = Math.min(arr[0]+k,arr[i]-k);
            ans = Math.min(ans,maxi-mini);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        int result = getMinDiff(arr , arr.length , k);
        System.out.println(result);
    }
}
