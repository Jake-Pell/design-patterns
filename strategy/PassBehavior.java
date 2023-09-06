package strategy;

import java.util.Random;

public class PassBehavior implements OffenseBehavior{
    /**
     * Simulates a player passing the ball on offense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        Random rand = new Random();
        int randInt = rand.nextInt(5);
        if (randInt == 0)
            return "throws a slant route";
        if (randInt == 1)
            return "throws an out route";
        if (randInt == 2)
            return "throws a seem route";
        if (randInt == 3)
            return "throws a screen pass";
        if (randInt == 4)
            return "throws a hail mary";
        return "";
    }
}
