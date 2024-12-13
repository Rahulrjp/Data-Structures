package Array;
import  java.lang.Math;
import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ans=1;
        int count=1;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j]) //one more platform needed
            {
                count++;
                i++;
            }
            else //one platform can be reduced
            {
                count--;
                j++;
            }
            ans=Math.max(ans,count); //updating the value with the current maximum
        }
        return ans;
    }

    public static void main(String[] args) {
        int  arr[] = {900, 940, 950, 1100, 1500, 1800};
        int  dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int result = findPlatform(arr,dep,arr.length);
        System.out.println(result);
    }
}
