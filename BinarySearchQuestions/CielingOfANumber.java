package BinarySearchQuestions;

public class CielingOfANumber {
    public int Cieling(int[] arr , int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    public int Floor(int[] arr , int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int item = 87;
        CielingOfANumber obj = new CielingOfANumber();
        int result = obj.Cieling(arr,item);
        int result1 = obj.Floor(arr,item);
//        if (result !=-1){
//            System.out.println("Item is found at index : "+ result);
//        }
//        else {
//            System.out.println("Item not found");
//        }
        System.out.println(result);
        System.out.println(result1);

    }
}
