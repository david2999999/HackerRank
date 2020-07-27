package Hackerank.Warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }

        result.add(alicePoints);
        result.add(bobPoints);

        return result;
    }
}
