// Q. Find the Smallest charecter greater than target
//  Note - Letters Should be Wrap Around
// Leetcode - Q.744
package BinarySearchQuestions;

public class GreaterCharecter {
    public int Searchchar(char[] arr , int target){
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }
            else {
                return mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        char[] arr = {'a','d','f','j','k'};
        char target = 'c';
        GreaterCharecter obj = new GreaterCharecter();
        int result = obj.Searchchar(arr,target);
        if(target > arr[arr.length-1]){
            System.out.println(arr[0]);
        }
        else {
            System.out.println(arr[result]);

        }
    }
}
