package Interview;

import java.util.HashMap;

public class SubString {
    private static String twoString(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) return "NO";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: s1.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }

            map.put(c, map.get(c) + 1);
        }

        for (char c: s2.toCharArray()) {
            if (map.containsKey(c)) {
                return "YES";
            }
        }

        return "NO";
    }
}
