package logic;

public class TTetronimo {

	int rotation;
	int[][] Itetronimo = new int[3][3];

	public void rotate(int rotation) {
		this.rotation = rotation;
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Itetronimo = new int[][] {

			{ 0, 0, 0 }, { 0, 6, 0 }, { 6, 6, 6 }, };
			break;
		case (1):
			Itetronimo = new int[][] {

			{ 0, 6, 0 }, { 6, 6, 0 }, { 0, 6, 0 }, };
			break;
		case (2):
			Itetronimo = new int[][] {

			{ 6, 6, 6 }, { 0, 6, 0 }, { 0, 0, 0 }, };
			break;
		case (3):
			Itetronimo = new int[][] {

			{ 6, 0, 0 }, { 6, 6, 0 }, { 6, 0, 0 }, };

		}
	}
}