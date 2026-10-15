package Strings;

public class Palindrome {
    static void main() {
        String s1= "Madam";
        String palin = new StringBuilder(s1).reverse().toString();
        System.out.println(palin);
    }
}
