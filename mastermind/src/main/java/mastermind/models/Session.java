package mastermind.models;

public class Session {
	private Board board;
	private BoardRegistry registry;
	private boolean active;
	
	
	public Session() {
		active = true;
	}

	public Session(Board board, BoardRegistry registry) {
		this.board = board;
		this.registry = registry;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public BoardRegistry getRegistry() {
		return registry;
	}

	public void setRegistry(BoardRegistry registry) {
		this.registry = registry;
	}
	
	public void kill () {
		active = false;
	}
	
	public boolean isActive() {
		return active;
	}
}