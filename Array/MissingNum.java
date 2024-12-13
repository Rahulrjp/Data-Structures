// Q. https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
/*Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

Examples:

Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.*/

package Array;

public class MissingNum {
    public int missingNumber(int n, int arr[]) {

        // first way
//        int sum = 0;
//        for( int i = 0; i < n - 1; i++ )
//            sum += arr[ i ];
//        int diff = sum - ( n - 1 )*( n )/ 2;
//        return n - diff;
//
        //Second way

            int sum_arr=0;
            for(int i = 0;i<arr.length-1;i++){
                sum_arr+=arr[i];
            }
            int sum_n=(n*(n+1))/2;
            return sum_n-sum_arr;
    }


    public static void main(String[] args)  {
        int[] arr = new int[]{1, 2, 3, 4,6,7,8,};
        MissingNum obj = new MissingNum();
        int result = obj.missingNumber(arr.length, arr);
        System.out.println(result);
    }
}