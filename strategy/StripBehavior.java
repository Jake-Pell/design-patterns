package strategy;
public class StripBehavior implements DefenseBehavior{
    /**
     * Simulates a player stripping the ball on defense
     * @return A string that represents the outcome of the play
     */
    public String play() {
        return "Strip a ball from runner's hands.";
    }
}
