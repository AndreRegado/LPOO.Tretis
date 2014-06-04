package logic;

public interface Block {
	void rotate();
	int [][] getBlock();
	int getX();
	int getY();
	void setX(int value);
	void setY(int value);
};
