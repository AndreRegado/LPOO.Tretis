package logic;

public class LTetronimo extends Block {
	LTetronimo(int x, int y) {
		super(x, y);
	
	}

	int rotation;
	int[][] Itetronimo = new int[3][4];

	public void rotate(int rotation) {
		this.rotation = rotation;
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Itetronimo = new int[][] {

			{ 0, 3, 0, 0 }, { 0, 3, 0, 0 }, { 0, 3, 3, 0 }, };
			break;
		case (1):
			Itetronimo = new int[][] {

			{ 0, 0, 0, 0 }, { 0, 0, 3, 0 }, { 3, 3, 3, 0 }, };
			break;
		case (2):
			Itetronimo = new int[][] {

			{ 0, 3, 3, 0 }, { 0, 0, 3, 0 }, { 0, 0, 3, 0 }, };
			break;
		case (3):
			Itetronimo = new int[][] {

			{ 0, 3, 3, 3 }, { 0, 3, 0, 0 }, { 0, 0, 0, 0 }, };

		}
	}
}