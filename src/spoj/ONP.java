package spoj;

import java.util.Stack;

public class ONP {

    public static void main(String[] args) {
        String expr = "((a+t)*((b+(a+c))^(c+d)))";
        String polish = getPolish(expr);

        System.out.println(polish);
    }

    private static String getPolish(String expr) {
        char[] exprAry = expr.toCharArray();

        Stack<Character> argStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        for (char c : exprAry) {
            if (isOperation(c)) {
                opStack.push(c);
            } else if (Character.isAlphabetic(c)) {
                argStack.push(c);
            } else if (c == ')') {
                char op = opStack.pop();
                argStack.push(op);
            }
        }

        StringBuilder polishExpr = new StringBuilder();
        while (!argStack.isEmpty()) {
            polishExpr.append(argStack.pop());
        }
        return polishExpr.reverse().toString();
    }

    private static boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '*' || c =='/' || c == '^';
    }
}
