package Array;

public class Equilibrium {
    public int equilibriumPoint(long[] arr) {
        // Your code here
        long sum1=0;
        long sum2=0;
            for (long i : arr){
                sum1 += i;
            }
            for (int i = 0 ; i<arr.length;i++){
                sum1 -= arr[i];
                if (sum1 == sum2){
                    return i+1;
                }
                sum2 += arr[i];
            }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1,3,5,2,2};
        Equilibrium obj = new Equilibrium();
        long result = obj.equilibriumPoint(arr);
        System.out.println(result);
    }
}
