package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("42")) {
                return;
            }
            System.out.println(s);
        }
    }
}
