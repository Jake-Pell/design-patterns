package singleton;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Singleton class that represents an instance of the anagram game
 * Used to generate questions and check if answers are right
 */
public class Game {
	private static Game game;
	private Random rand = new Random();
	private Difficulty level;
	private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
	private Anagram currentAnagram;
	private int score;

	/**
	 * private constructor that is only called once
	 * creates a new game and populates a hash map
	 * with three difficulties of anagrams
	 */
	private Game() {
		rand = new Random();
		level = Difficulty.EASY;
		anagrams = new HashMap<>();
		anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
		anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
		anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
	}

	/**
	 * Creates an instance of Game if it does not already exist
	 * @return the instance of game that was created/already exists
	 */
	public static Game getInstance() {
		if (game == null)
			game = new Game();
		return game;
	}

	/**
	 * Chooses a random anagram question from the current difficulty
	 * @return A string of the randomly generated question
	 */
	public String getQuestion() {
		ArrayList<Anagram> questions = anagrams.get(level);
		int randInt = rand.nextInt(questions.size());
		currentAnagram = questions.get(randInt);
		return currentAnagram.getQuestion();
	}

	/**
	 * Compares the answer given by the user to the list of 
	 * possible answers for the current anagram
	 * Increase score if the answer is correct, decrase score if incorrect
	 * @param userAnswer A string of the answer given by the user
	 * @return true if userAnswer matches a possible answer, false otherwise
	 */
	public boolean isCorrect(String userAnswer) {

		if (currentAnagram.isCorrect(userAnswer)) {
			++score;
			level = checkDifficulty();
			return true;
		}
		--score;
		level = checkDifficulty();
		return false;
	}

	/**
	 * Gets the current score for the user
	 * @return An integer of the current score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Helper method to determine what difficulty 
	 * should be used based on score
	 * @return Variable of type Difficulty based on the user's current score
	 */
	private Difficulty checkDifficulty() {
		if (score < 7)
			return Difficulty.EASY;
		if (score < 11)
			return Difficulty.MEDIUM;
		return level = Difficulty.HARD;
	}


}