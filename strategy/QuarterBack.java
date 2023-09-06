package strategy;
import java.util.Random;
public class QuarterBack extends Player {
    /**
     * Creates a new quarterback with a first and last name, and indicates
     * whether or not they are on offense
     * @param firstName
     * @param lastName
     * @param offense
     */
    public QuarterBack(String firstName, String lastname, boolean offense) {
        super(firstName, lastname, offense);
    }

     /**
     * Randomly sets a quarterback's offensive behavior to
     * either run or pass
     */
    public void setOffenseBehavior() {
        Random rand = new Random();
        int randBehavior = rand.nextInt(2);
        if (randBehavior == 0)
            OffenseBehavior = new RunBehavior();
        else if (randBehavior == 1)
            OffenseBehavior = new PassBehavior();

    }

    /**
     * Sets a quarterback's defensive behavior to null
     */
    public void setDefenseBehavior() {
        DefenseBehavior = null;
    }
}
