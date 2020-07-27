package Interview;

import java.util.*;

public class CountTriplets {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        long r = 1;
        Long[] arr = {(long) 1, (long) 1, (long) 1, (long) 1, (long) 1};

        System.out.println(countTriplets(Arrays.asList(arr), r));
    }

    static long numberOfWays(long n) {
        if (n < 3) return 0;
        else if (n == 3) return 1;
        else {
            long minus2 = n - 2;
            return ((minus2 * (minus2 + 1)) / 2);
        }
    }


    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> map = new HashMap<>();
        long countTriplets = 0;

        for (Long num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, (long) 0);
            }

            map.put(num, map.get(num) + 1);
        }

        for (Long num : arr) {
            if (map.containsKey(num * r) && map.containsKey(num * r * r)) {
                if (map.get(num * r) == 1 && map.get(num * r * r) == 1 && (num != num * r)) {
                    countTriplets++;
                    map.put(num, map.get(num) - 1);
                } else {
                    if (num.equals(num * r)) {
                        countTriplets += numberOfWays(map.get(num));
                        map.put(num, map.get(num) - 1);
                    } else {
                        countTriplets += (map.get(num * r) * map.get(num * r * r));
                        map.put(num, map.get(num) - 1);
                    }
                }
            }
        }

        return countTriplets;
    }
}
