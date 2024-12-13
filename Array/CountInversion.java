package Array;

public class CountInversion {
    static long inversionCount(long[] arr, int n) {
        // Your Code Here
        /*  This code also works, but it takes more time (Greater than O(nlogn))

        long count = 0;
        for (int i = 0; i < n-1 ; i++){
            for (int j = i + 1 ; j < n; j++){
                if (arr[i] > arr[j]){
                    count = count+1;
                }
            }
        }
        return count;
         */
        return mergeSortAndCount(arr, 0, n - 1);
    }
    private static long mergeSortAndCount(long[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left half and right half
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);

            // Count split inversions and merge the two halves
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static long mergeAndCount(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        long[] leftArray = new long[n1];
        long[] rightArray = new long[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        long inversions = 0;

        // Merge the two arrays and count inversions
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                inversions += (n1 - i); // Count inversions
            }
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }

        return inversions;
    }

    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        long result = inversionCount(arr,arr.length);
        System.out.println(result);
    }
}
