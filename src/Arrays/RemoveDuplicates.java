package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    static void main() {
        int[] a = {12,34,23,12,56,78,10,0,8,8,56};
        Set <Integer> set = new LinkedHashSet<>();

        for(int num: a){
            set.add(num);

        }
        System.out.println(set);

    }
}
