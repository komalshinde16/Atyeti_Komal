package Strings;

public class FindDuplicates {
    static void main() {
        String s1 = "programming";

        for(int i=0; i<s1.length(); i++){
            for (int j = i+1; j < s1.length(); j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    System.out.println(s1.charAt(i));
                    break;
                }
            }
        }
    }
}
