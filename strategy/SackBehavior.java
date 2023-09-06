package strategy;

public class SackBehavior implements DefenseBehavior{
    /**
     * Simulates a player sacking the quarterback on defense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        return "Sack the quarterback";
    }
}
