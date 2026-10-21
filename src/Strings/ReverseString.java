package Strings;

public class ReverseString {
    static void main() {
        String s1= "komal";
        String reversed = "";
        for (int i = 0; i < s1.length(); i++) {
            reversed = s1.charAt(i)+ reversed;
        }
        System.out.println(reversed);
        }
    }

