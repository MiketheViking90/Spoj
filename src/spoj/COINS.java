package spoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COINS {

    private static Map<Long, Long> mem = new HashMap<>();

    public static void main(String[] args) {
        initMap();

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            long solution = runTrial(n);
            System.out.println(solution);
        }
        in.close();
    }

    private static void initMap() {
        for (long i = 0; i <= 4; i++) {
            mem.put(i,i);
        }
    }

    private static long runTrial(long n) {
        if (n <= 4) {
            return mem.get(n);
        }
        return buildSubSolutions(n);
    }

    private static long buildSubSolutions(long n) {
        if (mem.get(n) == null) {
            long sol1 = buildSubSolutions(n/2);
            long sol2 = buildSubSolutions(n/3);
            long sol3 = buildSubSolutions(n/4);

            long curSol = sol1 + sol2 + sol3;
            long val = Math.max(curSol, n);
            mem.put(n, val);
        }

        return mem.get(n);
    }
}
