package Arrays;

public class LinearSearch {
    static void main() {
        int[] a = {10,20,43,32,78,9,66,87};
        int target = 32;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == target){
                System.out.println("element found at " +i);
                return;
            }
        }
        System.out.println("element not found");
    }
}
