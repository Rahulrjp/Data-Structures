package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class SecondLargest {
    public int print2largest(List<Integer> arr) {
        int Maxindex = arr.size() - 1 ;
        int result = Integer.MAX_VALUE;
        if(arr.size() > 1) {
            Collections.sort(arr);
            Collections.reverse(arr);
            for(int i = 0 ; i < Maxindex ; i++){
                if(arr.get(i) > arr.get(i+1)){
                    result = arr.get(i + 1);
                    break;
                }
            }
        }
        else{
            return -1;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(29646 ,14713, 7843 ,3153 ,27830, 3182, 29439, 5327, 31431, 17107, 10309, 31971, 30490, 19313, 17383, 32456 ,4939, 12419, 2566, 26028, 26399, 32456, 6197 ,19811, 361, 8919, 7552, 2653, 46 ,12467 ,21421, 19925, 29703, 18847, 7617 ,23116, 4807 ,5171);
        System.out.println(arr);
        SecondLargest obj = new SecondLargest();
        int result  = obj.print2largest(arr);
        System.out.println(result);
     }
}
