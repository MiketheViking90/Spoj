package spoj;

public class PALIN {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            String n = in.next();
//            String result = runTrial(n);
//            System.out.println(result);
//        }
//        in.close();
        runTrial("1991");
    }

    private static String runTrial(String n) {
        StringBuilder nextPalindrome = new StringBuilder();
        nextPalindrome.append(n);

        int len = n.length();
        int mid = n.length() / 2;
        for (int i = 0; i <= mid; i++) {
            System.out.println(n.charAt(i) + " vs. " + n.charAt(len - i - 1));
            int mirrorIndex = len - i - 1;
            boolean areRecipricalCharsEqual = (n.charAt(i) == n.charAt(mirrorIndex));
            if (!areRecipricalCharsEqual) {
                nextPalindrome = correctToPalindrome(nextPalindrome, i, mirrorIndex);
                System.out.println(nextPalindrome);
            }
        }
        return nextPalindrome.toString();
    }

    private static StringBuilder correctToPalindrome(StringBuilder sb, int i, int j) {
        System.out.println("Difference at char: " + i);
        char c = sb.charAt(i);
        char d = sb.charAt(j);
        int cVal = Character.getNumericValue(c);
        int dVal = Character.getNumericValue(d);

        if (cVal > dVal) {
            sb.replace(j, j + 1, String.valueOf(cVal));
        } else {
            sb.replace(i, i+1, String.valueOf(dVal));
            sb.replace(j, j + 1, String.valueOf(dVal));
        }
        return sb;
    }
}
