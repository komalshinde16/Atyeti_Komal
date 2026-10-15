package Arrays;

public class MinElementinArrays {
    static void main() {
        int[] array = {20,60,56,90,44,3,98};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }

}
