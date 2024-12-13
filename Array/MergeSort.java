package Array;

import java.util.*;

public class MergeSort {
    static int[] partition(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = partition(Arrays.copyOfRange(arr, 0, mid));
        int[] right = partition(Arrays.copyOfRange(arr, mid, arr.length));

        /*int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        System.arraycopy(arr,0,left,0,mid);
        System.arraycopy(arr,mid,right,0,arr.length-mid);
        devide(left);
        devide(right);*/

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArr = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newArr[k] = first[i];
                i++;
            } else {
                newArr[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            newArr[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            newArr[k] = second[j];
            j++;
            k++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] result = partition(arr);
        System.out.println(Arrays.toString(result));
    }
}
