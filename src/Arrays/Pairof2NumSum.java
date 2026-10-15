package Arrays;

public class Pairof2NumSum {
    static void main() {
        int[] a = {1,2,3,4,5};
        int sum = 6;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){

                if(a[i]+a[j]== sum){
                    System.out.println(a[i] + ","+ a[j]);
                }
            }

        }

        }
    }




