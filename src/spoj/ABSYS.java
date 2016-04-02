package spoj;

import java.util.Scanner;

public class ABSYS {

    private static final String BLOT = "machula";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        for (int i = 0; i < t * 2; i++) {
            String line;
            if(!(line = in.nextLine()).isEmpty()){
                String output = playRound(line);
                System.out.println(output);
            }
        }
        in.close();
    }

    private static String playRound(String line) {
        String[] inputs = line.split(" ");
        String[] output = replaceBlot(inputs);
        return String.join(" ", inputs);
    }

    private static String[] replaceBlot(String[] inputs) {
        int blotIndex = getBlotIndex(inputs);

        if (blotIndex == 0 || blotIndex == 2) {
            return reverseOperate(inputs, blotIndex);
        } else {
            return operate(inputs);
        }
    }

    private static String[] reverseOperate(String[] inputs, int blotIndex) {
        int altIndex = getOtherInputIndex(blotIndex);

        int sum = Integer.parseInt(inputs[4]);
        int addee = Integer.parseInt(inputs[altIndex]);

        inputs[blotIndex] = String.valueOf(sum - addee);
        return inputs;
    }

    private static int getOtherInputIndex(int blotIndex) {
        if (blotIndex == 0) {
            return 2;
        } else {
            return 0;
        }
    }

    private static String[] operate(String[] inputs) {
        int addend1 = Integer.parseInt(inputs[0]);
        int addend2 = Integer.parseInt(inputs[2]);

        inputs[4] = String.valueOf(addend1 + addend2);
        return inputs;
    }

    private static int getBlotIndex(String[] inputs) {
        for (int i=0; i<=4; i += 2) {
            if (inputs[i].contains(BLOT)) {
                return i;
            }
        }
        return -1;
    }
}
