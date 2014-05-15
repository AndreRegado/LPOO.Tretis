package logic;

public class ITetromino {

	int rotation;
	int[][] Itetronimo = new int[4][4];

	public void rotate(int rotation) {
		this.rotation = rotation;
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Itetronimo = new int[][] { { 0, 1, 0, 0 }, { 0, 1, 0, 0 },
					{ 0, 1, 0, 0 }, { 0, 1, 0, 0 }, };
			break;
		case (1):
			Itetronimo = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
					{ 1, 1, 1, 1 }, { 0, 0, 0, 0 }, };
			break;
		case (2):
			Itetronimo = new int[][] { { 0, 1, 0, 0 }, { 0, 1, 0, 0 },
					{ 0, 1, 0, 0 }, { 0, 1, 0, 0 }, };
			break;
		case (3):
			Itetronimo = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
					{ 1, 1, 1, 1 }, { 0, 0, 0, 0 }, };
			break;
		}
	}
}
