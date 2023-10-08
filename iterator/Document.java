package iterator;
import java.util.Stack;

/**
 * A document that can have changes made to it.
 * Changes can be undone and redone
 */
public class Document {

	private String title;
	private Stack<String> undoStack;
	private Stack<String> redoStack;

	/**
	 * Creates a new instance of a document
	 * Makes new empty undo and redo stacks
	 * @param title A string that represents the name of the document
	 */
	public Document(String title) {
		this.title = title;
		this.undoStack = new Stack<String>();
		this.redoStack = new Stack<String>();

	}

	/**
	 * Makes a change to the document and adds the change to the undo stack
	 * @param change A string of the change to be made
	 * @return A string stating that the change was made
	 */
	public String makeChange(String change) {
		undoStack.add(change);
		return "Making Change: " + undoStack.peek();
	}

	/**
	 * Undoes the last change made to the document
	 * Takes the last change from the undo stack and adds it to the redo stack
	 * @return A string stating the change that was undone
	 */
	public String undoChange() {
		if (!canUndo())
			return null;
		redoStack.add(undoStack.pop());
		return "Undoing: " + redoStack.peek();

	}

	/**
	 * Checks if there is a change to be undone
	 * @return a boolean representing if an undo is possible
	 */
	public boolean canUndo() {
		return !undoStack.empty();
	}

	/**
	 * Redoes the last change that was undone
	 * Takes the last change from the redo stack and adds it to the undo stack
	 * @return A string stating the change that was redone
	 */
	public String redoChange() {
		if (!canRedo())
			return null;
		undoStack.add(redoStack.pop());
		return "Redoing: " + undoStack.peek();
	}

	/**
	 * Checks if there is a change to be redone
	 * @return a boolean representing if a redo is possible
	 */
	public boolean canRedo() {
		return !redoStack.empty();
	}

	/**
	 * Creates a new stack iterator for the undo stack
	 * @return The StackIterator that was created
	 */
	public StackIterator getUndoIterator() {
		return new StackIterator(undoStack);
	}

	/**
	 * Creates a new stack iterator for the redo stack
	 * @return The StackIterator that was created
	 */
	public StackIterator getRedoIterator() {
		return new StackIterator(redoStack);
	}

}