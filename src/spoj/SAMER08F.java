package spoj;

public class SAMER08F {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(numSquares(n));
    }

    private static int numSquares(int n) {
        int sum = 0;
        while (n > 1) {
            sum += (n * n);
            n--;
        }
        return sum + 1;
    }
}
