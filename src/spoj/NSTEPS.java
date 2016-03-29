package spoj;

public class NSTEPS {

    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        int val = getStepVal(x, y);
        System.out.println(val);
    }

    private static int getStepVal(int x, int y) {
        if (x == y) {
            if (x % 2 == 0) {
                return x + y;
            } else {
                return x + y - 1;
            }
        } else if ((x - 2) == y) {
            return x + y;
        } else {
            return -1;
        }
    }
}
