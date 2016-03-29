package spoj;

public class ACPC10A {

    public static void main(String[] args) {
        String input = "4 7 10";
        String input1 = "2 6 8";

        int[] inVals = parseStringInput(input1);
        System.out.println(getNextInSequence(inVals));
    }

    private static int[] parseStringInput(String input) {
        String[] vals = input.split(" ");
        int n = vals.length;
        int[] intVals = new int[vals.length];

        for (int i = 0; i < vals.length; i++) {
            String s = vals[i];

            int intVal = Integer.parseInt(s);
            intVals[i] = intVal;
        }
        return intVals;
    }

    private static String getNextInSequence(int[] seq) {
        int a = seq[0];
        int b = seq[1];
        int c = seq[2];

        int diff1 = b - a;
        int diff2 = c - b;

        int div1 = b / a;
        int div2 = c / b;

        if (diff1 == diff2) {
            return "AP " + (c + diff1);
        } else {
            return "GP " + (c * div1);
        }
    }
}
