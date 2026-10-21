package Arrays;

import java.util.Arrays;

public class ReverseArray {

    static void main() {
        int[] a = {12,2,3,5,6,7,8,6,4,3,2};
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
