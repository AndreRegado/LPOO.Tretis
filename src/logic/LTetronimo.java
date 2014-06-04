package logic;

public class LTetronimo implements Block {
	int x;
	int y;
	int rotation = 0;
	static int[][] Ltetronimo = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 3, 0 },
			{ 3, 3, 3, 0 } };

	LTetronimo(int x, int y) {
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
			Ltetronimo = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 3, 0 },
					{ 3, 3, 3, 0 } };
			break;
		case (1):
			Ltetronimo = new int[][] { { 0, 3, 0, 0 }, { 0, 3, 0, 0 },
					{ 0, 3, 3, 0 } };
			break;

		case (2):
			Ltetronimo = new int[][] { { 0, 3, 3, 3 }, { 0, 3, 0, 0 },
					{ 0, 0, 0, 0 } };
			break;
		case (3):
			Ltetronimo = new int[][] { { 0, 3, 3, 0 }, { 0, 0, 3, 0 },
					{ 0, 0, 3, 0 } };
			break;
		}
	}

	@Override
	public int[][] getBlock() {
		return Ltetronimo;
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