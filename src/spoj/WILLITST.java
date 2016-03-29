package spoj;

import java.util.Scanner;

public class WILLITST {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();

        willItStop(t);
        in.close();
    }

    private static void willItStop(long n) {
        while (n > 1) {
            if (divisibleByTwo(n)) {
                n /= 2;
                System.out.println(n);
            } else {
                n = ((n*3) + 3);
                System.out.println(n);
            }
        }
    }

    private static boolean divisibleByTwo(long n) {
        return ((n%2) == 0);
    }
}
