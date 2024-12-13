package Array;

public class LongestalternatingSubsequence {
    static int alternatingMaxLength(int[] arr) {
        int n = arr.length;
        int even = 1, odd = 1;
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                even = odd + 1;
            } else if (arr[i] < arr[i - 1]) {
                odd = even + 1;
            }
            maxLength = Math.max(maxLength, Math.max(even, odd));
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int result = alternatingMaxLength(arr);
        System.out.println(result);

    }
}
