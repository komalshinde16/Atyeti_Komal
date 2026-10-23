package Strings;

public class Longest_word {
    static void main() {
        String s1 = "welcome to international airport";
        String s2[] = s1.split("\\s+");
        int max = 0;

        for (int i = 0; i < s2.length; i++) {
            String temp = s2[i];

            if (max<temp.length()){
                max = temp.length();

            }

        }
        for (int i=0; i<s2.length; i++){
            String temp = s2[i];
            if (max == temp.length()){
                System.out.println(temp);
            }
        }
    }
}