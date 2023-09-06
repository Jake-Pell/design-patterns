package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior DefenseBehavior;
    protected OffenseBehavior OffenseBehavior;

    /**
     * Creates a new player with a first and last name, and indicates
     * whether or not they are on offense
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Determines the behavior that a player will have when they are on defense
     */
    public abstract void setDefenseBehavior();

    /**
     * Determines the behavior that a player will have when they are on offense
     */
    public abstract void setOffenseBehavior();

    /**
     * Simulates running a play for a specific player
     * @return A string that represents the outcome of the play
     */
    public String play() {
        if (offense && OffenseBehavior != null)
            return OffenseBehavior.play();
        if (DefenseBehavior != null)
            return DefenseBehavior.play();
        return "is not playing";
    }

    /**
     * Swaps between offense and defense
     */
    public void turnover() {
        offense = !offense;
    }

    /**
     * Creates a string representation of a football player
     * @return A string of the player's first and last name
     */
    public String toString() {
        return firstName + " " + lastName;
    }

}
