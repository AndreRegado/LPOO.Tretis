package logic;

public class ITetronimo extends Block {
	
	int rotation = 1;
	static int[][] Itetronimo = new int[][] { { 0, 1, 0, 0 }, { 0, 1, 0, 0 },
		{ 0, 1, 0, 0 }, { 0, 1, 0, 0 }, };

	ITetronimo(int x, int y) {
		super(x, y, Itetronimo);
	}
	
	public void rotate(int rotation) {
		this.rotation = rotation;
		//Roda a peça
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
