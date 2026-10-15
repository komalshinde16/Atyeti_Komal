package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesbyHashmap {
    static void main() {
        String s = "Programming";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        String result = "";

        for (char ch : map.keySet()) {
            result += ch;
        }
        System.out.println(result);
    }
    }















