package logic;

public class OTetronimo {
	int rotation;
	int[][] Itetronimo = new int[2][2];

	public void rotate(int rotation) {
		this.rotation = rotation;
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Itetronimo = new int[][] {

			{ 4, 4 }, { 4, 4 }, };
			break;
		case (1):
			Itetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		case (2):
			Itetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		case (3):
			Itetronimo = new int[][] { { 4, 4 }, { 4, 4 }, };
			break;
		}
	}
}