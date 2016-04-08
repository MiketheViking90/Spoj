package spoj;

import java.util.Scanner;

public class GIRLSNBS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int girls = in.nextInt();
            int boys = in.nextInt();

            if (girls == -1) {
                return;
            }

            int maxConsecutive = calculateMaxConsec(girls, boys);
            System.out.println(maxConsecutive);
        }
        in.close();
    }

    private static int calculateMaxConsec(int girls, int boys) {
        if (girls == 0) {
            return boys;
        }
        if (boys == 0) {
            return girls;
        }

        int max = Math.max(girls, boys);
        int min = Math.min(girls, boys);

        double val = max/(min + 1.0);
        return (int) Math.ceil(val);
    }
}
