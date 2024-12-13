package Array;

public class sumPair {
    static int getPairsCount(int[] arr, int sum) {
        // code here
//        int count = 0;
//        for (int i = 0 ;i < arr.length-1 ;i++){
//            for (int j = i+1 ;j < arr.length;j++){
//                if (arr[i]+arr[j] == sum){
//                    count = count + 1;
//                }
//            }
//        }
//        return count;
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == sum) {
                // Handle duplicates here if needed
                count++;
                left++;
                right--;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int sum = 6;
        int result = getPairsCount(arr,sum);
        System.out.println(result);
    }
}
