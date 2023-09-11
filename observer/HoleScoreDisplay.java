package observer;

public class HoleScoreDisplay implements Observer {

	private Subject golfer;
	private int strokes;
	private int par;

	/**
	 * Creates a new observer that keeps track of a golfer's score
	 * for an individual hole
	 * @param golfer A golfer of type Subject whose score is going to be tracked
	 */
	public HoleScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		this.golfer.registerObserver(this);
	}

	/**
	 * Update an observer with new values for strokes and par
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void update(int strokes, int par) {
		this.strokes = strokes;
		this.par = par;
	}

	/**
	 * Creates a string representation of a golfer's stats for
	 * an individual hole
	 * Includes total strokes, total par, and strokes 
	 * over or under par
	 * @return String of golfer's stats
	 */ 
	public String toString() {
		int strokeDifference = strokes - par;
		String ret = "Current Hole stats: Par(" + par + ") "
				+ "Strokes (" + strokes + "), ";
		if (strokeDifference == 0)
			ret += "Making par";
		else if (strokeDifference < 0)
			ret += -strokeDifference + " under par";
		else if (strokeDifference > 0)
			ret += strokeDifference + " over par";
		return ret;
		
	}
}