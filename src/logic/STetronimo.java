package logic;

public class STetronimo extends Block {

	STetronimo(int x, int y) {
		super(x, y);		// TODO Auto-generated constructor stub
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

			{ 0, 0, 0 }, { 0, 5, 5 }, { 5, 5, 0 }, };
			break;
		case (1):
			Itetronimo = new int[][] {

			{ 0, 5, 0 }, { 0, 5, 5 }, { 0, 0, 5 }, };
			break;
		case (2):
			Itetronimo = new int[][] {

			{ 0, 0, 0 }, { 0, 5, 5 }, { 5, 5, 0 }, };
			break;
		case (3):
			Itetronimo = new int[][] {

			{ 0, 5, 0 }, { 0, 5, 5 }, { 0, 0, 5 }, };
			break;
		}
	}
}