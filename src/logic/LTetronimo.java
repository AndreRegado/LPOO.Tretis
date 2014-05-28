package logic;

public class LTetronimo extends Block {
	int rotation = 0;
	static int[][] Ltetronimo = new int[][] { { 0, 3, 0, 0 }, { 0, 3, 0, 0 },
			{ 0, 3, 3, 0 }, };

	LTetronimo(int x, int y) {
		super(x, y, Ltetronimo);

	}

	public void rotate(int rotation) {
		this.rotation = rotation;
		howItIs();
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Ltetronimo = new int[][] {

			{ 0, 3, 0, 0 }, { 0, 3, 0, 0 }, { 0, 3, 3, 0 }, };
			break;
		case (1):
			Ltetronimo = new int[][] {

			{ 0, 0, 0, 0 }, { 0, 0, 3, 0 }, { 3, 3, 3, 0 }, };
			break;
		case (2):
			Ltetronimo = new int[][] {

			{ 0, 3, 3, 0 }, { 0, 0, 3, 0 }, { 0, 0, 3, 0 }, };
			break;
		case (3):
			Ltetronimo = new int[][] {

			{ 0, 3, 3, 3 }, { 0, 3, 0, 0 }, { 0, 0, 0, 0 }, };

		}
	}
}