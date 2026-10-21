package Arrays;

public class SortedorNot {
    static void main() {
        int[] a = {1,2,3,4,5};
        boolean sorted = true;

        for(int i=0; i<a.length-1; i++){
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
