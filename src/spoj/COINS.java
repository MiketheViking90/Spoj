package spoj;

import java.util.Scanner;

public class COINS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        System.out.println("trials: " + t);
        for (int i = 0; i < t; i++) {
            runTrial(in);
        }
    }

    private static void runTrial (Scanner in) {
        int n = in.nextInt();
        System.out.println("dollars: " + n);
        int val = convertToBytelandian(n);
        System.out.println("bytlandian: " + val);
        System.out.println(val);
    }

    private static int convertToBytelandian(int n) {
        int exchangeValue = 0;
        int denomination = 2;

        while (denomination != 5) {
            exchangeValue = incrementByDenomination(exchangeValue, denomination, n);
            System.out.println("current val: " + exchangeValue);
            denomination++;
        }
        return exchangeValue;
    }

    private static int incrementByDenomination(int exchangeVal, int denom, int val) {
        if (isDivisible(val, denom)) {
            int numberCoins = (val / denom);
            System.out.println("\t number of " + denom + " coins: " + numberCoins);
        }
        return exchangeVal;
    }

    private static boolean isDivisible(int n, int d) {
        double dividend = (double) n / d;
        return (dividend % 1) == 0;
    }
}
