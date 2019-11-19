
public class Coordinate {
	private int xCord;
	private int yCord;
	/* this will take place of the isTrap from the C++ version, 
	it can be S for start, E for end, T for true and F for false*/
	private char typeOfTile; 
	
	public Coordinate() {
		this.xCord = 0;
		this.yCord = 0;
		this.typeOfTile = 'F';
	}
	
	public Coordinate(int x, int y, char type) {
		this.xCord = x;
		this.yCord = y;
		this.typeOfTile = type;
	}
	
	public boolean isAdjacent(int x, int y) {
		// Need to check if x and y user moved to is a valid move,
		// i.e; N, S, E, W, NW, NE, SW, SE
		
		// N
		if(this.xCord == x && (this.yCord+1) == y) {
			return true;
		}
		// S
		else if(this.xCord == x && (this.yCord-1) == y) {
			return true;
		}
		// E
		else if((this.xCord+1) == x && this.yCord == y) {
			return true;
		}
		// W
		else if((this.xCord-1) == x && this.yCord == y) {
			return true;
		}
		// NE
		else if((this.xCord+1) == x && (this.yCord+1) == y) {
			return true;
		}
		// NW
		else if((this.xCord-1) == x && (this.yCord+1) == y) {
			return true;
		}
		// SE
		else if((this.xCord+1) == x && (this.yCord-1) == y) {
			return true;
		}
		// SW
		else if((this.xCord-1) == x && (this.yCord-1) == y) {
			return true;
		}
		
		return false;
	}

	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public char getTypeOfTile() {
		return typeOfTile;
	}

	public void setTypeOfTile(char typeOfTile) {
		this.typeOfTile = typeOfTile;
	}
}
