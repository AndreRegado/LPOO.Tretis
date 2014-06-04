package logic;

public class OTetronimo implements Block {
	int x;
	int y;
	int rotation = 0;
	static int[][] Otetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };

	OTetronimo(int x, int y) {
		this.x = 2;
		this.y = 2;
	}

	public void rotate() {
		this.rotation += 1;
		if (rotation == 4)
			rotation = 0;
		howItIs();
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Otetronimo = new int[][] {

			{ 4, 4 }, { 4, 4 }, };
			break;
		case (1):
			Otetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		case (2):
			Otetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		case (3):
			Otetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		}
	}

	@Override
	public int[][] getBlock() {
		return Otetronimo;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void setX(int value) {
		this.x = value;
	}

	@Override
	public void setY(int value) {
		this.y = value;
	}
}