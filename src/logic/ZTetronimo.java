package logic;

public class ZTetronimo extends Block {
	int rotation = 0;
	static int[][] Ztetronimo = new int[][] { { 0, 0, 0 }, { 0, 6, 0 },
			{ 6, 6, 6 }, };

	ZTetronimo(int x, int y) {
		super(x, y, Ztetronimo);
	}

	public void rotate(int rotation) {
		this.rotation = rotation;
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
}