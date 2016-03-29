package spoj;

public class ADDREV {

    public static void main(String[] args) {
        String a = "4358";
        String b = "7540";

        String aRev = reverseNumber(a);
        String bRev = reverseNumber(b);

        int sum = Integer.parseInt(aRev) + Integer.parseInt(bRev);
        System.out.println(sum);
        System.out.println(reverseNumber(sum));
    }

    private static String reverseNumber(String n) {
        String nRev = new StringBuilder(n).reverse().toString();

        int i = 0;
        while (nRev.charAt(i) == '0') {
            i++;
        }
        return nRev.substring(i, n.length());
    }

    private static String reverseNumber(int n) {
        String nStr = String.valueOf(n);
        String nRev = new StringBuilder(nStr).reverse().toString();

        int i = 0;
        while (nRev.charAt(i) == '0') {
            i++;
        }
        return nRev.substring(i, nStr.length());
    }
}
