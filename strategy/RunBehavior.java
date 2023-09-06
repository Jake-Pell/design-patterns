package strategy;

import java.util.Random;

public class RunBehavior implements OffenseBehavior{
    /**
     * Simulates a player running the ball on offense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        if (randInt == 0)
            return "runs a drive(up the gut)";
        if (randInt == 1)
            return "runs a draw";
        if (randInt == 2)
            return "runs a pitch";
        if (randInt == 3)
            return "runs a reverse";
        return "";
    }
}
