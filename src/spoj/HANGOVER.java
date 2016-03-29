package spoj;

import java.util.Scanner;

public class HANGOVER {

    private static String CARD_SUFFIX = " card(s)";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            double sum = in.nextDouble();
            if (sum == 0.00) {
                return;
            }
            int index = getHarmonicSeriesIndex(sum);

            System.out.println(index + CARD_SUFFIX);
        }
        in.close();
    }

    private static int getHarmonicSeriesIndex(double sum) {
        int denom = 2;
        double harmonicSum = 0;

        while (harmonicSum < sum) {
            harmonicSum += (1.0/denom);
            denom++;
        }

        int index = denom - 2;
        return index;
    }
}