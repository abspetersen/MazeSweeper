
public class Player {
	private int lives;
	private Coordinate currentCoordinate;
	private Coordinate start;
	private Coordinate end;
	
	public Player() {
		
	}
	
	public Player(Grid g) {
		this.lives = 5;
		this.start = g.getStartCoordinate();
		this.end = g.getEndCoordinate();
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public Coordinate getCurrentCoordinate() {
		return currentCoordinate;
	}

	public void setCurrentCoordinate(Coordinate currentCoordinate) {
		this.currentCoordinate = currentCoordinate;
	}

	public Coordinate getStart() {
		return start;
	}

	public void setStart(Coordinate start) {
		this.start = start;
	}

	public Coordinate getEnd() {
		return end;
	}

	public void setEnd(Coordinate end) {
		this.end = end;
	}
}
