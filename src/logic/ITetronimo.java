package logic;

public class ITetronimo extends Block {
	
	int rotation = 0;
	static int[][] Itetronimo = new int[4][4];

	ITetronimo(int x, int y) {
		super(x, y, Itetronimo);
	}
	
	public void rotate(int rotation) {
		this.rotation = rotation;
		//Roda a pe�a
		howItIs();
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