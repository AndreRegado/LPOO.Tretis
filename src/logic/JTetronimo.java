package logic;

public class JTetronimo implements Block {
	int x;
	int y;
	int rotation = 0;
	static int[][] Jtetronimo = new int[][] { { 0, 0, 0 }, { 2, 0, 0 },
			{ 2, 2, 2 }, };

	JTetronimo(int x, int y) {
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
			Jtetronimo = new int[][] { { 0, 0, 0 }, { 2, 0, 0 }, { 2, 2, 2 }, };
			break;
		case (1):
			Jtetronimo = new int[][] { { 2, 2, 0 }, { 2, 0, 0 }, { 2, 0, 0 }, };
			break;
		case (2):
			Jtetronimo = new int[][] { { 2, 2, 2 }, { 0, 0, 2 }, { 0, 0, 0 }, };
			break;
		case (3):
			Jtetronimo = new int[][] { { 0, 0, 2 }, { 0, 0, 2 }, { 0, 2, 2 }, };
			break;
		}
	}

	@Override
	public int[][] getBlock() {
		return Jtetronimo;
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