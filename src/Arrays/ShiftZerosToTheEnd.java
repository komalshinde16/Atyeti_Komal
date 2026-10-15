package Arrays;

import java.util.Arrays;

public class ShiftZerosToTheEnd {
    static void main() {
        int[] a =  {1,3,0,9,8,0,7,6,0,6,5,0,4,0,3,0};

        int j=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
