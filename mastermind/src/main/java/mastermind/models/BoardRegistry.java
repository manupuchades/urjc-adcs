package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class BoardRegistry {

	private List<BoardMemento> mementos;
	private int index;

	public BoardRegistry() {
		index = 0;
		mementos = new ArrayList<BoardMemento>();
		mementos.add(new BoardMemento(new Board()));
	}

	public void save(Board board) {	
		index++;
		mementos.subList(index, mementos.size()).clear();
		mementos.add(new BoardMemento(board));
	}

	public BoardMemento undo() {
		index--;
		return mementos.get(index);
	}

	public BoardMemento redo() {
		index++;
		return mementos.get(index);
	}

	public boolean isUndoPossible() {
		return index > 0;
	}

	public boolean isRedoPossible() {
		return index < mementos.size() - 1;
	}
}
