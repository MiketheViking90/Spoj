package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class TOANDFRO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int size = in.nextInt();
            if (size == 0) {
                break;
            }

            String msg = in.next();
            String decryptedMsg = decrypt(size, msg);
            System.out.println(decryptedMsg);
        }
        in.close();
    }

    private static String decrypt(int col, String msg) {
        int row = (msg.length() / col);
        char[][] msgMatrix = getMatrixRepresentation(row, col, msg);
        System.out.println(Arrays.deepToString(msgMatrix));
        return decryptFromMatrix(msgMatrix);
    }

    private static char[][] getMatrixRepresentation(int row, int col, String msg) {
        char[][] msgMatrix = new char[row][col];
        boolean reverse = false;

        int cnt = 0;
        for (int r = 0; r < row; r++) {
            if (reverse) {
                for (int c = col - 1; c >= 0; c--) {
                    msgMatrix[r][c] = msg.charAt(cnt++);
                }
            } else {
                for (int c = 0; c < col; c++) {
                    msgMatrix[r][c] = msg.charAt(cnt++);
                }
            }
            reverse = !reverse;
        }
        return msgMatrix;
    }

    private static String decryptFromMatrix(char[][] msgMatrix) {
        int row = msgMatrix.length;
        int col = msgMatrix[0].length;

        StringBuilder msg = new StringBuilder(row * col);

        for (int c = 0; c < col; c++) {
            for (int r = 0; r < row; r++) {
                char chr = msgMatrix[r][c];
                msg.append(chr);
            }
        }
        return msg.toString();
    }
}

