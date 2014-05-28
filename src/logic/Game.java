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
				if (actualGame[i][j] == 0)
					System.out.print("  ");
				else
					System.out.print(actualGame[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	static void RandomBlock() {
		Random randomBlock = new Random();
		int next = randomBlock.nextInt(7);
		switch (next) {
		case 0:
			currentBlock = new ITetronimo(2, 2);
			break;
		case 1:
			currentBlock = new JTetronimo(4, 4);
			break;
		case 2:
			currentBlock = new LTetronimo(4, 4);
			break;
		case 3:
			currentBlock = new OTetronimo(4, 4);
			break;
		case 4:
			currentBlock = new STetronimo(4, 4);
			break;
		case 5:
			currentBlock = new TTetronimo(4, 4);
			break;
		case 6:
			currentBlock = new ZTetronimo(4, 4);
			break;
		}
	}

	public static void main(String[] args) {
		RandomBlock();
		printBoard();
	}

}