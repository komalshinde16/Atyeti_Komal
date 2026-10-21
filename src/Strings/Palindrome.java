package Strings;

public class Palindrome {
    static void main() {
        String s1= "madam";
        String reversed = "";
//        String palin = new StringBuilder(s1).reverse().toString();
//        System.out.println(palin);

        for (int i = 0; i < s1.length(); i++) {
            reversed = s1.charAt(i)+ reversed;

        }
        if(s1.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
