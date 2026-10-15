package Strings;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesByHashSet {
    static void main() {
        String s1= "programming";

        Set<Character> set = new HashSet<>();

        for(char ch : s1.toCharArray()){
            set.add(ch);
        }
        String result = "";

        for(char ch : set){
        result += ch;
        }
        System.out.println(result);
    }
}
