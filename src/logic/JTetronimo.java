package logic;

public class JTetronimo extends Block {

	int rotation = 0;
	static int[][] Jtetronimo = new int[][] { { 0, 0, 2 }, { 0, 0, 2 }, { 0, 2, 2 }, };
	
	JTetronimo(int x, int y) {
		super(x, y, Jtetronimo);

	}

	public void rotate(int rotation) {
		this.rotation = rotation;
		howItIs();
	}

	public void howItIs() {
		switch (rotation) {
		case (0):
			Jtetronimo = new int[][] {

			{ 0, 0, 2 }, { 0, 0, 2 }, { 0, 2, 2 }, };
			break;
		case (1):
			Jtetronimo = new int[][] {

			{ 0, 0, 0 }, { 2, 0, 0 }, { 2, 2, 2 }, };
			break;
		case (2):
			Jtetronimo = new int[][] {

			{ 2, 2, 0 }, { 2, 0, 0 }, { 2, 0, 0 }, };
			break;
		case (3):
			Jtetronimo = new int[][] {

			{ 2, 2, 2 }, { 0, 0, 2 }, { 0, 0, 0 }, };

		}
	}
}