package strategy;
import java.util.Random;

public class BlockBehavior implements DefenseBehavior{
    /**
     * Simulates a blocking play for a specific player
     * @return A string that represents the outcome of the block
     */
    public String play() {
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        if (randInt == 0)
            return "block a kick";
        if (randInt == 1)
            return "block a punt";
        if (randInt == 2)
            return "block a pass";
        if (randInt == 3)
            return "block a catch";
        return "";
    }
}
