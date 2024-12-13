package Array;

import java.util.*;

public class CountSort {

//    public static HashMap<Integer,Integer> count(int[] arr){
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for (int i = 0;i<arr.length;i++){
//            if (hm.containsKey(arr[i])){
//                hm.put(arr[i],hm.get(arr[i])+1);
//            }
//            else {
//                hm.put(arr[i],1);
//            }
//        }
//        return hm;
//    }
//
//    public static void sort(int[] arr){
//        HashMap<Integer,Integer> hm = count(arr);
//        int[] newarr = new int[arr.length];
//        Set<Integer> keys = hm.keySet();
//    }
public static int[] countingSort(int[] arr) {
    // Step 1: Use a HashMap to count the occurrences of each element
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int num : arr) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Get the keys (unique elements) and sort them
    List<Integer> sortedKeys = new ArrayList<>(countMap.keySet());
    Collections.sort(sortedKeys);

    // Step 3: Rebuild the sorted array using the counts from the map
    int index = 0;
    for (int key : sortedKeys) {
        int count = countMap.get(key);  // Get count for the current key
        while (count > 0) {
            arr[index++] = key;  // Place the element back into the array
            count--;
        }
    }

    return arr;  // Return the sorted array
}

    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};
        System.out.println(Arrays.toString(countingSort(arr)));
    }
}
