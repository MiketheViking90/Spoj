package spoj;

import java.util.Scanner;

public class EIGHTS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            long k = Long.parseLong(in.next());
            long val = getKthCube(k);

            System.out.println(val);
        }
        in.close();
    }

    private static long getKthCube(long k) {
        return 192 + (250 * (k - 1));
    }
}
