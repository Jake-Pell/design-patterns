package observer;

public class RoundScoreDisplay implements Observer {

	private Subject golfer;
	private int strokesTotal;
	private int parTotal;

	/**
	 * Creates a new observer that keeps track of a golfer's score
	 * for an entire round
	 * @param golfer A golfer of type Subject whose score is going to be tracked
	 */
	public RoundScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		this.golfer.registerObserver(this);
	}

	/**
	 * Update an observer with new values for strokes and par
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void update(int strokes, int par) {
		strokesTotal += strokes;
		parTotal += par;
	}

	/**
	 * Creates a string representation of a golfer's stats for
	 * an entire round
	 * Includes total strokes, total par, and strokes 
	 * over or under par
	 * @return String of golfer's stats
	 */ 
	public String toString() {
		int strokeDifference = strokesTotal - parTotal;
		String ret = "Overall stats: Par(" + parTotal + ") "
				+ "Strokes (" + strokesTotal + "), ";
		if (strokeDifference == 0)
			ret += "Making par";
		else if (strokeDifference < 0)
			ret += -strokeDifference + " under par";
		else if (strokeDifference > 0)
			ret += strokeDifference + " over par";
		return ret;
	}
}