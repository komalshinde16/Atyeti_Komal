package Strings;

public class Count_frequency_characters {
        public static void main(String[] args) {

            String s = "programming";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
//                It takes the character at the current index and stores it in ch.
                int count = 0;

                if (s.indexOf(ch) != i) {
                    continue;
                }

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " = " + count);
            }
        }
    }


