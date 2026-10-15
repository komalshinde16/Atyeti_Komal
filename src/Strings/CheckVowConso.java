package Strings;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class CheckVowConso {
    static void main() {

        String s1 = "KomAl ShiNde123*";

        int vowels = 0;
        int consonants =0;

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if((ch>='a' && ch<='z')||
            (ch>='A' && ch<='Z')){

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
    }
}
