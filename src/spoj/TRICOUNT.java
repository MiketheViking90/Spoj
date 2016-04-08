package spoj;

import java.util.Scanner;

public class TRICOUNT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        System.out.println(t);
        for (int i = 0; i < t; i++) {
            long n = in.nextInt();
            long numTriangles = (((n - 1) * (n - 2)) / 2) + n;
            System.out.println(numTriangles);
        }
        in.close();
    }
}
