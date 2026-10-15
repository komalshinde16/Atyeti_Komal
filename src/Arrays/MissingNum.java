package Arrays;

public class MissingNum {
    static void main() {
        int[] a = {1,2,4,5};
        int n = a[a.length-1];
        n = n*(n+1)/2;

        for (int i = 0; i < a.length; i++) {
            n-= a[i];


        }
        System.out.println(n);
    }
}
