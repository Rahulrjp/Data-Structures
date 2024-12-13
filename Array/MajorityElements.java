package Array;

import java.util.Arrays;

public class MajorityElements {
    static int majorityElement(int a[], int size)
    {
        /* Takes more time
        for (int i=0;i<size;i++){
            int count = 0;
            for (int j=i;j<size;j++){
                if(a[i] == a[j]){
                    count = count + 1;
                    if (count > size/2) {
                        return a[i];
                    }
                }
            }
        }
        return -1;
         */
        Arrays.sort(a);
        int count = 1;
        if(size==1){
            return a[0];
        }
        else {
            for(int i = 0 ; i < size-1 ; i++ ){
                if(a[i] == a[i+1]){
                    count +=1;
                    if (count > size/2){
                        return a[i];
                    }

                }
                else count=1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2} ;
        int result = majorityElement(arr,arr.length);
        System.out.println(result);
    }
}
