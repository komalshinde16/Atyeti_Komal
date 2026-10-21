package Arrays;

public class BinarySearch {
    static void main() {
        int[] a ={10,20,30,40,50,60,70};
        int target = 90;

        int low=0;
        int high=a.length-1;

        while(low<=high){
            int mid= (low+high)/2;

            if (a[mid]==target){
                System.out.println("element found=" +mid);
                return;
            } else if (a[mid]<target) {
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        System.out.println("element not found");
    }
}
