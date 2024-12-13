/*
leetcode:

34. Find First and Last Position of Element in Sorted Array
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
*/

package BinarySearchQuestions;
import java.util.Arrays;

public class NumPosition {

        public int[] searchRange(int[] nums, int target) {
            int ans[]=new int[2];
            Arrays.fill(ans,-1);
            if(nums.length==1 && nums[0]==target)
            {
                Arrays.fill(ans,0);
                return ans;
            }
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                    ans[0]=i;
                    break;
                }
            }
            for(int i=nums.length-1;i>=0;i--)
            {
                if(nums[i]==target)
                {
                    ans[1]=i;
                    break;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,4,6,6,7,7,8,9};
        int target = 3;
        NumPosition obj = new NumPosition();
        int[] newarr = obj.searchRange(arr,target);
        System.out.println(Arrays.toString(newarr));
    }
}
