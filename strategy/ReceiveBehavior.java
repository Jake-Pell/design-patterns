package strategy;

import java.util.Random;

public class ReceiveBehavior implements OffenseBehavior{
    /**
     * Simulates a receiver running a route on offense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        if (randInt == 0)
            return "runs a slant route";
        if (randInt == 1)
            return "runs an out route";
        if (randInt == 2)
            return "runs a seem route";
        if (randInt == 3)
            return "runs a screen pass";
        if (randInt == 4)
            return "runs a hail mary";
        return "";
    }
}
