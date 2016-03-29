package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class JULKA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            runTest(in);
        }
    }

    private static void runTest(Scanner in) {
        BigInteger total = new BigInteger(in.next());
        BigInteger diff = new BigInteger(in.next());

        BigInteger K = getLargerNumber(total, diff);
        BigInteger N = total.subtract(K);

        System.out.println(K);
        System.out.println(N);
    }

    private static BigInteger getLargerNumber(BigInteger total, BigInteger diff) {
        BigInteger numerator = total.add(diff);
        return numerator.divide(BigInteger.valueOf(2));
    }
}
