package logic;

public class ZTetronimo extends Block {
	ZTetronimo(int x, int y) {
		super(x, y);
		
	}

	int rotation;
	int[][] Itetronimo = new int[3][3];

	public void rotate(int rotation) {
		this.rotation = rotation;
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Itetronimo = new int[][] {

			{ 0, 0, 0 }, { 7, 7, 0 }, { 0, 7, 7 }, };
			break;
		case (1):
			Itetronimo = new int[][] {

			{ 0, 7, 0 }, { 7, 7, 0 }, { 7, 0, 0 }, };
			break;
		case (2):
			Itetronimo = new int[][] {

			{ 0, 0, 0 }, { 7, 7, 0 }, { 0, 7, 7 }, };
			break;
		case (3):
			Itetronimo = new int[][] {

			{ 0, 7, 0 }, { 7, 7, 0 }, { 7, 0, 0 }, };
			break;

		}
	}
}