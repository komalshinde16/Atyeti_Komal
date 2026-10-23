package Strings;


//package Strings;

public class StringCompression {
    public static void main(String[] args) {

        String s = "aaabb";
        String result = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i) + count;
                count = 1;
            }
        }

        result = result + s.charAt(s.length() - 1) + count;

        System.out.println(result);
    }
}

