package Arrays;

public class SortedorNot {
    static void main() {
        int[] a = {3,98,67,54,32,11,23,8};
        boolean sorted = true;

        for(int i=0; i<a.length; i++){
            if(a[i]>a[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
