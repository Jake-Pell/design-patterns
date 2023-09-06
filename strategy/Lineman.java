package strategy;

import java.util.Random;

public class Lineman extends Player{
    /**
     * Creates a new lineman with a first and last name, and indicates
     * whether or not they are on offense
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    /**
     * Sets a lineman's offensive behavior to OBlock behavior
     */
    public void setOffenseBehavior() {
        OffenseBehavior = new OBlockBehavior();
    }

    /**
     * Randomly sets a lineman's defensive behavior to
     * either block, strip, or sack
     */
    public void setDefenseBehavior() {
        Random rand = new Random();
        int randBehavior = rand.nextInt(3);
        if (randBehavior == 0)
            DefenseBehavior = new BlockBehavior();
        else if (randBehavior == 1)
            DefenseBehavior = new StripBehavior();
        else if (randBehavior == 2)
            DefenseBehavior = new SackBehavior();
        
    }
}
