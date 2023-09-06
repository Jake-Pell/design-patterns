package strategy;

public class Receiver extends Player{
    /**
     * Creates a new receiver with a first and last name, and indicates
     * whether or not they are on offense
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }  

    /**
     * Sets a receiver's offensive behavior to receive
     */
    public void setOffenseBehavior() {
        OffenseBehavior = new ReceiveBehavior();
    }

    /**
     * Sets a receiver's defensive behavior to null
     */
    public void setDefenseBehavior() {
        DefenseBehavior = null;
    }
}
