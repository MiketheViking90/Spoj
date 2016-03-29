package spoj;

import java.util.Scanner;

public class AE00 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSquares = in.nextInt();
        int possibleRectangles = getPossibleRectangles(numSquares);

        System.out.println(possibleRectangles);
    }

    private static int getPossibleRectangles(int n) {
        int numRectangles = 1;

        for (int f = 2; f <= n; f++) {
            numRectangles += getFactors(f);
        }

        return numRectangles;
    }

    private static int getFactors(int n) {
        int sqrt = (int) Math.sqrt(n);

        int numFactors = 1;
        for (int f = 2; f <= sqrt; f++) {
            double dividend = ((double) n / f);
            if (isInt(dividend)) {
                numFactors++;
            }
        }
        return numFactors;
    }

    private static boolean isInt(double d) {
        return (d == (int) d);
    }
}
