//   Normal Binary Search...

package BinarySearchQuestions;

public class BinarySearch {
    public int Search(int[] arr ,int target){
        int start =0;
        int end = arr.length-1;
        for (int i = 0;i<arr.length;i++){
            int mid =(start+end)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
//    public int Search(int[] arr , int start , int end , int target){
//        int mid;
//        for (int i = 0;i<arr.length;i++){
//            mid =(start+end)/2;
//            if(arr[mid] < target){
//                start = mid + 1;
//            } else if (arr[mid]>target) {
//                end = mid -1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67,78,89,90};
        int item = 34;
        BinarySearch obj = new BinarySearch();
        int result = obj.Search(arr,item);
        if (result != -1){
            System.out.println("Item is found at index : "+ result);
        }
        else {
            System.out.println("Item not found");
        }
    }
}
