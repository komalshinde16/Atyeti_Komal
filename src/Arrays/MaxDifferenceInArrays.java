package Arrays;

public class MaxDifferenceInArrays {
    static void main() {
        int[] a= {6,20,30,100,10};
        int min = a[0];
        int maxDiff = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]-min>maxDiff){
                maxDiff= a[i]-min;
            }
            if (a[i]<min){
                min = a[i];
            }

        }
        System.out.println(maxDiff);
    }
}
