package Interview;

import java.util.HashMap;

public class RansomNote {
    private static void checkMagazine(String[] magazine, String[] note) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean match = true;

        for (String s: magazine) {
            for (char c : s.toCharArray()) {
                if (c != ' ') {
                    if (!map.containsKey(c)) {
                        map.put(c, 0);
                    }

                    map.put(c, map.get(c) + 1);
                }
            }
        }

        outerLoop: for (String s: note) {
            for (char c: s.toCharArray()) {
                if (c != ' ') {
                    if (!map.containsKey(c)) {
                        match = false;
                        break outerLoop;
                    }

                    if (map.get(c) == 0) {
                        match = false;
                        break outerLoop;
                    }

                    map.put(c, map.get(c) - 1);
                }
            }
        }

        if (match) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
