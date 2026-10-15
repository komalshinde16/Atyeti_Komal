package Arrays;

public class MaxElement {
    static void main() {
        int[ ] array = {10,20,30,40,50,60};
        int max= array[0];

        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max= array[i];
            }
        }
        System.out.println(max);
    }
}
