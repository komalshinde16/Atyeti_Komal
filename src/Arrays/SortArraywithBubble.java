package Arrays;

import java.util.Arrays;

public class  SortArraywithBubble {
    static void main() {
        int [] a = {12,34,32,6,54,76,33,1};

        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){

                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
