package Array;

public class PeakElement {
    static int peakElement(int[] arr,int n)
    {

        if(arr.length==1) {
            return 0;
        }
        if(arr[0]>=arr[1]) {
            return 0;
        }
        if(arr[arr.length-1]>=arr[arr.length-2]) {
            return arr.length-1;
        }
        for(int i=0;i<arr.length-1;i++) { //i=1
            if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int result = peakElement(arr,arr.length);
        System.out.println(result);
    }
}
