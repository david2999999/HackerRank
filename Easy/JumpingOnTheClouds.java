package Interview;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr = {0 ,0 ,0 ,0 ,1 ,0};
        System.out.println(jumps(arr));
    }

    private static int jumps(int[] c) {
        int maxCloud = c.length;
        int currentCloudNumber = 0;
        int steps = 0;

        while (true) {
            if (currentCloudNumber + 1 < maxCloud && c[currentCloudNumber + 1] == 1) {
                steps++;
                currentCloudNumber += 2;
            }

            if (currentCloudNumber + 1 < maxCloud && c[currentCloudNumber + 1] == 0) {
                if (currentCloudNumber + 2 < maxCloud && c[currentCloudNumber + 2] == 0) {
                    steps++;
                    currentCloudNumber+= 2;
                } else {
                    steps++;
                    currentCloudNumber++;
                }
            }

            if (currentCloudNumber >= maxCloud - 1) {
                break;
            }
        }

        return steps;
    }
}
