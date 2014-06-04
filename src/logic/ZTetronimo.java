package logic;

public class ZTetronimo implements Block {
	int x;
	int y;

	int rotation = 0;
	static int[][] Ztetronimo = new int[][] {

	{ 0, 0, 0 }, { 7, 7, 0 }, { 0, 7, 7 }, };

	ZTetronimo(int x, int y) {
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
			Ztetronimo = new int[][] {

			{ 0, 0, 0 }, { 7, 7, 0 }, { 0, 7, 7 }, };
			break;
		case (1):
			Ztetronimo = new int[][] {

			{ 0, 7, 0 }, { 7, 7, 0 }, { 7, 0, 0 }, };
			break;
		case (2):
			Ztetronimo = new int[][] {

			{ 0, 0, 0 }, { 7, 7, 0 }, { 0, 7, 7 }, };
			break;
		case (3):
			Ztetronimo = new int[][] {

			{ 0, 7, 0 }, { 7, 7, 0 }, { 7, 0, 0 }, };
			break;

		}
	}

	@Override
	public int[][] getBlock() {
		return Ztetronimo;
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