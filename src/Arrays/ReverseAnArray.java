package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    static void main() {
        int[] a = {10,20,30,40,50,60,70};
        int i=0, j= a.length-1;

        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j]= temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(a));
    }
}
