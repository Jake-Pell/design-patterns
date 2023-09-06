package strategy;

public class OBlockBehavior implements OffenseBehavior{
    /**
     * Simulates a player blocking defenders on offense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        return "Block Defenders";
    }
}
