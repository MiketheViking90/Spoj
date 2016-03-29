package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class FASHION {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            runTrial(in);
        }
    }

    private static void runTrial(Scanner in) {
        int size = in.nextInt();
        int[] menScores = getScores(size, in);
        int[] womenScores = getScores(size, in);

        int totalBondScore = computeDotProduct(menScores, womenScores);
        System.out.println(totalBondScore);
    }

    private static int[] getScores(int size, Scanner in) {
        int[] scores = new int[size];
        for (int i = 0; i < size; i++) {
            scores[i] = Integer.parseInt(in.next());
        }
        Arrays.sort(scores);
        return scores;
    }

    private static int computeDotProduct(int[] menScores, int[] womenScores) {
        int len = menScores.length;

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += (menScores[i] * womenScores[i]);
        }
        return sum;
    }
}
