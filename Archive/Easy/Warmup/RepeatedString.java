package Interview;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("a", 10000000));
    }

    private static long repeatedString(String s, long n) {
        int len = s.length();
        long multiplier = n / len;
        long remainder = n % len;
        long aCount = 0;

        for (char c: s.toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }

        aCount *= multiplier;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') aCount++;
        }

        return aCount;
    }
}
