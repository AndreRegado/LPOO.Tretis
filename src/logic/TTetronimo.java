package logic;

public class TTetronimo implements Block {
	int x;
	int y;
	int rotation = 0;
	static int[][] Ttetronimo = new int[][] { { 0, 0, 0 }, { 0, 6, 0 },
			{ 6, 6, 6 }, };

	TTetronimo(int x, int y) {
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
			Ttetronimo = new int[][] { { 0, 0, 0 }, { 0, 6, 0 }, { 6, 6, 6 }, };
			break;
		case (1):
			Ttetronimo = new int[][] { { 6, 0, 0 }, { 6, 6, 0 }, { 6, 0, 0 }, };
			break;
		case (2):
			Ttetronimo = new int[][] { { 6, 6, 6 }, { 0, 6, 0 }, { 0, 0, 0 }, };
			break;
		case (3):
			Ttetronimo = new int[][] { { 0, 6, 0 }, { 6, 6, 0 }, { 0, 6, 0 }, };
			break;
		}
	}

	@Override
	public int[][] getBlock() {
		return Ttetronimo;
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