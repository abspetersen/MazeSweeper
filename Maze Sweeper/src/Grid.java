
public class Grid {
	private Coordinate grid[][];
	private Coordinate startCoordinate;
	private Coordinate endCoordinate;
	
	public Grid() {
		
	}
	
	public Grid(int xSize, int ySize) {
		grid = new Coordinate[xSize][ySize];
	}
	
	public void addCoordinate(Coordinate c) {
		grid[c.getxCord()][c.getyCord()] = c;
	}
	
	public int displayNumberofAdjacentTraps(Coordinate c) {
		int count = 0;
		boolean done = false;
		
		while(done == false) {
			try {
				// N
				if(grid[c.getxCord()][c.getyCord()+1].getTypeOfTile() == 'F') {
					count++;
				}
				// S
				else if(grid[c.getxCord()][c.getyCord()-1].getTypeOfTile() == 'F') {
					count++;
				}
				// W
				else if(grid[c.getxCord()-1][c.getyCord()].getTypeOfTile() == 'F') {
					count++;
				}
				// E
				else if(grid[c.getxCord()+1][c.getyCord()].getTypeOfTile() == 'F') {
					count++;
				}
				// SE
				else if(grid[c.getxCord()+1][c.getyCord()-1].getTypeOfTile() == 'F') {
					count++;
				}
				// SW
				else if(grid[c.getxCord()-1][c.getyCord()-1].getTypeOfTile() == 'F') {
					count++;
				}
				// NW
				else if(grid[c.getxCord()-1][c.getyCord()+1].getTypeOfTile() == 'F') {
					count++;
				}
				
				else if(grid[c.getxCord()+1][c.getyCord()+1].getTypeOfTile() == 'F') {
					count++;
				}
				done = true;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				continue;
			}
		}
		return count;
	}

	public Coordinate getCoordinate(int x, int y) {
		return grid[x][y];
	}

	public Coordinate getStartCoordinate() {
		return startCoordinate;
	}

	public void setStartCoordinate(Coordinate startCoordinate) {
		this.startCoordinate = startCoordinate;
	}

	public Coordinate getEndCoordinate() {
		return endCoordinate;
	}

	public void setEndCoordinate(Coordinate endCoordinate) {
		this.endCoordinate = endCoordinate;
	}
	
	
	
	
}
