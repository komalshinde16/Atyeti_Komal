package Arrays;

public class SecondMax {
    static void main() {
        int[] array= {10,20,30,40,50,60,70};
        int max = array[0];
        int secMax = array[1];

        for(int i=0; i<array.length; i++){
            if(max<array[i]){
              secMax=max;
              max = array[i];
            } else if (secMax<array[i] && array[i]!= max) {
                secMax= array[i];

            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
