/*
Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

Examples

Input: n = 6, arr[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
Input: n = 5, arr[] = {10,4,2,4,1}
Output: 10 4 4 1
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
Input: n = 4, arr[] = {5, 10, 20, 40}
Output: 40
Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
Input: n = 4, arr[] = {30, 10, 10, 5}
Output: 30 10 10 5
Explanation: When an array is sorted in non-increasing order, all elements are leaders.
*/

package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = arr[n-1];
        list.add(max);
        for(int i = n-2 ; i >= 0 ; i--) {
            if (arr[i] < max) {
                continue;
            }
            max = arr[i];
            list.add(max);
        }
        for (int i = 0 ;i < list.size()/2 ; i++){
            Collections.swap(list,i,list.size()-i-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {6 ,5, 4, 3, 2, 1};
        ArrayList<Integer> result = leaders(arr.length,arr);
        System.out.println(result);
    }
}
