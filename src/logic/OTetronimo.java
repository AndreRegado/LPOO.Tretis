package logic;

public class OTetronimo extends Block {
	int rotation = 0;
	static int[][] Otetronimo = new int[][] {
	{ 4, 4 }, { 4, 4 }, };

	OTetronimo(int x, int y) {
		super(x, y, Otetronimo);

	}

	public void rotate(int rotation) {
		this.rotation = rotation;
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
}