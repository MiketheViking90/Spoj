package spoj;

public class FCTRL {

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(getTrailingZeros(n));
    }

    private static int getTrailingZeros(int n) {
        int zeros = 0;

        for (int i = 5; i < n; i *= 5) {
            zeros += (n / i);
        }
        return zeros;
    }
}
