package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class CANDY3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            runTrial(in);
        }
    }

    private static void runTrial(Scanner in) {
        int numChildren = in.nextInt();
        BigInteger[] candyCounts = new BigInteger[numChildren];

        for (int i = 0; i < numChildren; i++) {
            BigInteger candyCnt = BigInteger.valueOf(in.nextInt());
            candyCounts[i] = candyCnt;
        }

        boolean canPartitionCandy = isCandyCountDivisible(candyCounts);
        printResult(canPartitionCandy);
    }

    private static boolean isCandyCountDivisible(BigInteger[] candyCounts) {
        BigInteger sum = BigInteger.ZERO;
        int numChildren = candyCounts.length;

        for (int i = 0; i < numChildren; i++) {
            sum = sum.add(candyCounts[i]);
        }

        BigInteger len = BigInteger.valueOf(numChildren);
        return (sum.mod(len).equals(BigInteger.ZERO));
    }

    private static void printResult(boolean isDivisible) {
        String output;
        if (isDivisible) {
            output = "YES";
        } else {
            output = "NO";
        }
        System.out.println(output);
    }
}
