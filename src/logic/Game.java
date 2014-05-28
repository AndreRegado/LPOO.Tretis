package logic;

import java.util.Random;

public class Game {
	static int numberCol = 12;
	static int numberLin = 23;
	static Board board = new Board();
	static Block currentBlock;
	int speed;
	static int[][] actualGame = board.getactualGame();

	static void printBoard() {

		for (int i = 2; i < numberLin; i++) {
			for (int j = 0; j < numberCol; j++) {
				if(i == currentBlock.getX() && j == currentBlock.getY()) {
				for(int k = currentBlock.getITetronimo().size(); k <  ){
					for (int l =
					
					
				}
					
					
					
					
					
					
				}
				if (actualGame[i][j] == 0)
					System.out.print("  ");
				else
					System.out.print(actualGame[i][j] + " ");
			}
			System.out.println();
		}

	}

	void RandomBlock() {
		Random randomBlock = new Random();
		int next = randomBlock.nextInt(7);
		switch (next) {
		case 0:
			currentBlock = new ITetronimo(2, 2);
			break;
		case 1:
			currentBlock = new JTetronimo(2, 2);
			break;
		case 2:
			currentBlock = new LTetronimo(2, 2);
			break;
		case 3:
			currentBlock = new OTetronimo(2, 2);
			break;
		case 4:
			currentBlock = new STetronimo(2, 2);
			break;
		case 5:
			currentBlock = new TTetronimo(2, 2);
			break;
		case 6:
			currentBlock = new ZTetronimo(2, 2);
			break;
		}
	}

	public static void main(String[] args) {

		printBoard();
	}

}