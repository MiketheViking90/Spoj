package spoj;

import java.util.Scanner;

public class CANDY {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();

            if (N == -1) {
                return;
            }

            int[] candies = new int[N];
            for (int i = 0; i < N; i++) {
                candies[i] = in.nextInt();
            }
            int numMoves = getNumMoves(candies);
            System.out.println(numMoves);
        }
        in.close();
    }

    private static int getNumMoves(int[] candyCount) {
        int avg = getAvgCandies(candyCount);
        if (avg == -1) {
            return -1;
        }
        int netDeviance = countDevianceFromMean(candyCount, avg);

        return netDeviance / 2;
    }

    private static int countDevianceFromMean(int[] candyCount, int avg) {
        int sum = 0;
        for (int n : candyCount) {
            sum += Math.abs(n - avg);
        }
        return sum;
    }

    private static int getAvgCandies(int[] candies) {
        int sum = 0;

        for (int n : candies) {
            sum += n;
        }

        double avg = ((double) sum) / candies.length;
        if (isInt(avg)) {
            return (int) avg;
        } else {
            return -1;
        }
    }

    private static boolean isInt(double d) {
        return (d % 1) == 0;
    }
}
