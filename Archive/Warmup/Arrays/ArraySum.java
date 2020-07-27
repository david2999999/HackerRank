package Hackerank.Warmup;

public class ArraySum {
    public static void main(String[] args) {
        int[] ar = {1 ,2 ,3 ,4 ,10 ,11};
        System.out.println(simpleArraySum(ar));
    }
    private static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }

        return sum;
    }
}
