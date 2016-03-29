package spoj;

public class PRIME1 {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int N = in.nextInt();
        int N = 1;
        int i = 0;
        while (i < N) {
            //int a = in.nextInt();
            //int b = in.nextInt();
            int a = 3;
            int b = 5;

            boolean[] primes = getPrimes(a, b);

            for (int j = a; j <= b; j++) {
                if (primes[j]) {
                    System.out.print(j + " ");
                }
            }

            i++;
        }
    }

    private static boolean[] getPrimes(int lower, int higher) {
        boolean[] primes = getInitPrimeArray(higher);

        int maxFactor = (int) Math.sqrt(higher);
        for (int curFactor = 2; curFactor <= maxFactor; curFactor++) {
            int maxMultiple = higher / curFactor;
            for (int k = 2; k <= maxMultiple; k++) {
                if (primes[curFactor * k]) {
                    primes[curFactor * k] = false;
                }
            }
        }
        return primes;
    }

    private static boolean[] getInitPrimeArray(int n) {
        boolean[] vals = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            vals[i] = true;
        }

        return vals;
    }
 }
