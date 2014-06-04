package logic;

public class STetronimo implements Block {
	int x;
	int y;
	int rotation = 0;
	static int[][] Stetronimo = new int[][] { { 0, 0, 0 }, { 0, 5, 5 },
			{ 5, 5, 0 }, };

	STetronimo(int x, int y) {
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
			Stetronimo = new int[][] {

			{ 0, 0, 0 }, { 0, 5, 5 }, { 5, 5, 0 }, };
			break;
		case (1):
			Stetronimo = new int[][] {

			{ 0, 5, 0 }, { 0, 5, 5 }, { 0, 0, 5 }, };
			break;
		case (2):
			Stetronimo = new int[][] {

			{ 0, 0, 0 }, { 0, 5, 5 }, { 5, 5, 0 }, };
			break;
		case (3):
			Stetronimo = new int[][] {

			{ 0, 5, 0 }, { 0, 5, 5 }, { 0, 0, 5 }, };
			break;
		}
	}

	@Override
	public int[][] getBlock() {
		return Stetronimo;
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