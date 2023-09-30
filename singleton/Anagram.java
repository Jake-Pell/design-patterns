package singleton;
import java.util.ArrayList;

/**
 * Anagram containing a string of scrambled letters to be unscrambled
 * and an array list of posssible answers
 */
public class Anagram {
	private String question;
	private ArrayList<String> answers;

	/**
	 * Create a new instance of an anagram
	 * @param question A string of letters that make up the anagram
	 * @param answers An array list of possible answer to the question
	 */
	public Anagram(String question, ArrayList<String> answers) {
		this.question = question;
		this.answers = answers; 
	}

	/**
	 * Gets the question for an instance of anagram
	 * @return A string representing an anagram's question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Determines if a given input is in the possible answer list for an anagram
	 * @param userAnswer A string of the answer given by the user
	 * @return true if the user answer is in the possible answers, false if otherwise
	 */
	public boolean isCorrect(String userAnswer) {
		for (String a : answers) {
			if (a.equals(userAnswer))
				return true;
		}
		return false;
	}
}