package logic;

public class Block {
	int x;
	int y;
	int[][] block;

	Block(int x, int y, int[][] block) {
		this.x = x;
		this.y = y;
		this.block = block;
	}

	int [][] getBlock(){
		return block;
	}
	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int value) {
		x = value;

	}

	void setY(int value) {
		y = value;
	}
};
