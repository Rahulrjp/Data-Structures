package Array;

import java.util.ArrayList;
public class ArrayDuplicates {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                }
            }
        }
        for(int i = 0 ; i < list.size() - 1 ; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3,1,4, 2};
        ArrayDuplicates obj = new ArrayDuplicates();
        ArrayList<Integer> result;
        result = obj.duplicates(arr);
        System.out.println(result);
    }
}