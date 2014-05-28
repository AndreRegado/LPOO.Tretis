package logic;

public class STetronimo extends Block {
	int rotation = 0;
	static int[][] Stetronimo = new int[][] { { 0, 0, 0 }, { 0, 5, 5 },
			{ 5, 5, 0 }, };

	STetronimo(int x, int y) {
		super(x, y, Stetronimo);
	}

	public void rotate(int rotation) {
		this.rotation = rotation;
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
}