package Interview;

import java.util.Arrays;
import java.util.HashMap;

public class CoutingTurnsOnDice {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3};
        System.out.println(solution(arr));
    }



    public static int solution(int[] A) {
        HashMap<Integer, Integer> oppositeMap = new HashMap<>();
        int countSteps = 0;

        for (int i = 1; i <= 6; i++) {
            oppositeMap.put(i, 7 - i);
        }

        for (int i = 0; i < A.length; i++) {
            int minFlip = Integer.MAX_VALUE;
            int currentFlip;
            if (i == A.length - 1) break;

            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    currentFlip = 0;
                } else if (A[j] != oppositeMap.get(A[i])) {
                    currentFlip = 1;
                }else {
                    currentFlip = 2;
                }

                minFlip = currentFlip < minFlip ? currentFlip : minFlip;
            }

            countSteps += minFlip;
        }

        return countSteps;
    }

//    private static boolean containsOtherNumbers(int n, HashMap<Integer, Integer> map) {
//        for (int i = 1; i < 7; i++) {
//            if (i == n) continue;
//
//            if (map.containsKey(i)) return true;
//        }
//
//        return false;
//    }
}
