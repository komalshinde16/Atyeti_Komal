package Strings;

import java.util.Arrays;

public class CheckAnagram {
    static void main() {

        String s1= "silent";
        String s2= "listen";

        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("is an anagram");
        }else{
            System.out.println("not an anagram");
        }










    }
}
