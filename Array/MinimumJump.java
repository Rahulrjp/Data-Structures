package Array;

public class MinimumJump {
    static int minJumps(int[] arr, int n) {
        int i = 0;
        int jumps = 0;
        while(i < n-1){
            jumps = jumps + 1;
            i = i+arr[i];
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 20};
        int result = minJumps(arr , arr.length);
        System.out.println(result);
    }
}
