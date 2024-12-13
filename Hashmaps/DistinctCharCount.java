package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharCount {
    public static void main(String[] args) {
        String str =  "hello world";
        Map<Character,Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()){
            count.put(ch , count.getOrDefault(ch , 0) + 1);
        }
        for (Character ch : count.keySet()){
            int value = count.get(ch);
            System.out.println(ch + " : " + value);
        }
    }
}
