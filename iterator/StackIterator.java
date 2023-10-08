package iterator;
import java.util.Stack;
import java.util.Iterator;

/**
 * An iterator that goes through each element of a stack
 */
public class StackIterator implements Iterator {

	private Stack<String> items;
	private int position;

	/**
	 * Creates a new instance of a stack iterator
	 * @param items the stack to be iterated through
	 */
	public StackIterator(Stack<String> items) {
		this.items = items;
		this.position = 0;
	}

	/**
	 * Gets the next element in a stack
	 * @return the next String in the stack, returns null if position
	 * 		   is at the end of the stack
	 */
	public String next() {
		if (hasNext())
			return items.get(position++);
		return null;

	}

	/**
	 * Checks if the next element in the stack exists
	 * @return true if there is another element, false otherwise
	 */
	public boolean hasNext() {
		return position < items.size() && items.get(position) != null;
	}
}