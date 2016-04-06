package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ARMY {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            br.readLine();
            br.readLine();

            int godzillaFighter = getFighter(br.readLine());
            int mechaFighter = getFighter(br.readLine());

            String winner = fightArmies(godzillaFighter, mechaFighter);

            System.out.println(winner);
        }
    }

    private static int getFighter(String fighters) {
        String[] fighterList = fighters.split(" ");
        int fighter = Integer.parseInt(fighterList[0]);

        for(int i=0; i < fighterList.length; i++) {
            int curFighter = Integer.parseInt(fighterList[i]);
            if (curFighter > fighter) {
                fighter = curFighter;
            }
        }
        return fighter;
    }

    private static String fightArmies(int godzillaFighter, int mechaFighter) {
        if (mechaFighter > godzillaFighter) {
            return "MechaGodzilla";
        } else {
            return "Godzilla";
        }
    }
}
