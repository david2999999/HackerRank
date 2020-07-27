public class Staircase {
    public void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder pound = new StringBuilder();

            for (int j = 0; j < i; j++) {
                pound.append("#");
            }

            System.out.print(String.format("%" + n + "s", pound.toString()));

            if (i != n) {
                System.out.println();
            }
        }
    }
}