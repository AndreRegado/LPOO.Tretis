package logic;

public class TTetronimo extends Block {
	int rotation = 0;
	static int[][] Ttetronimo = new int[][] { { 0, 0, 0 }, { 0, 6, 0 },
			{ 6, 6, 6 }, };

	TTetronimo(int x, int y) {
		super(x, y, Ttetronimo);
	}

	public void rotate(int rotation) {
		this.rotation = rotation;
		howItIs();
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Ttetronimo = new int[][] {

			{ 0, 0, 0 }, { 0, 6, 0 }, { 6, 6, 6 }, };
			break;
		case (1):
			Ttetronimo = new int[][] {

			{ 0, 6, 0 }, { 6, 6, 0 }, { 0, 6, 0 }, };
			break;
		case (2):
			Ttetronimo = new int[][] {

			{ 6, 6, 6 }, { 0, 6, 0 }, { 0, 0, 0 }, };
			break;
		case (3):
			Ttetronimo = new int[][] {

			{ 6, 0, 0 }, { 6, 6, 0 }, { 6, 0, 0 }, };

		}
	}
}