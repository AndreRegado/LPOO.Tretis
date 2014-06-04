package logic;

import java.util.Random;

public class Game {
	static int numberCol = 12;
	static int numberLin = 23;
	static Board board = new Board();
	static Block currentBlock;
	int speed;
	static int[][] actualGame = board.getactualGame();
	static int[][] clearGame;

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

	boolean testMove(int newx, int newy) {
		int x = currentBlock.getX();
		int y = currentBlock.getY();

		int lin = currentBlock.getBlock().length;
		int col = currentBlock.getBlock()[0].length;

		int a = 0;
		int b = 0;

		for (int i = x; i < x + lin; i++) {
			for (int j = y; j < y + col; j++) {
				if (actualGame[i][j] != 0 && currentBlock.getBlock()[a][b] != 0)
					return false;
				b++;
			}
			b = 0;
			a++;
		}
		return true;
	}

	static void putBlock() {
		int x = currentBlock.getX();
		int y = currentBlock.getY();

		int lin = currentBlock.getBlock().length;
		int col = currentBlock.getBlock()[0].length;

		int a = 0;
		int b = 0;

		for (int i = x; i < x + lin; i++) {
			for (int j = y; j < y + col; j++) {
				if (actualGame[i][j] == 0 && currentBlock.getBlock()[a][b] != 0)
					actualGame[i][j] = currentBlock.block[a][b];
				b++;
			}
			b = 0;
			a++;
		}

	}

	static void printBlock() {
		for (int i = 0; i < currentBlock.getBlock().length; i++) {
			for (int j = 0; j < currentBlock.getBlock()[i].length; j++) {
				System.out.print(currentBlock.getBlock()[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void RandomBlock() {
		Random randomBlock = new Random();
		int next = randomBlock.nextInt(7);
		switch (next) {
		case 0:
			currentBlock = new ITetronimo(4, 4);
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

		putBlock();
		printBoard();
	}

}