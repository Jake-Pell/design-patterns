package strategy;

public class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior DefenseBehavior;
    protected OffenseBehavior OffenseBehavior;

    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    public void setDefenseBehavior() {
        // idk
    }

    public void setOffenseBehavior() {
        // see last method
    }

    public String play() {
        // play something
    }

    public void turnover() {
        // turn something over
    }

    public String toString() {
        
    }

}
