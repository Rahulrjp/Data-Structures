package Array;

import java.util.*;

public class MissingAndRepeating {
    static int[] findTwoElement(int[] arr, int n) {
        // code here
        int[] result = new int[2];
//        Arrays.sort(arr);
//        for (int i = 0 ; i < n-1 ; i++){
//           if (arr[i] == arr[i+1]){
//               result[0] = arr[i];
//           }
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != i+1 ){
//                result[1] = i+1;
//            }
//        }
//        return result;
        int i = 0;
        while (i < n) {
            if (arr[i] != i + 1 && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find the duplicate number (B) and missing number (A)
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                result[0] = arr[i];  // Duplicate number (B)
                result[1] = i + 1;   // Missing number (A)
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {13 ,33, 43 ,16, 25, 19, 23, 31, 29 ,35, 10 ,2 ,32, 11, 47, 15, 34, 46, 30 ,26 ,41, 18, 5 ,17 ,37 ,39, 6, 4, 20, 27, 9 ,3, 8, 40, 24, 44 ,14, 36, 7, 38 ,12, 1, 42, 12 ,28 ,22 ,45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] result = findTwoElement(arr,arr.length);
        System.out.print(Arrays.toString(result));
    }
}
