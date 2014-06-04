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
	int lineDele;

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

	static boolean testMove(int newx, int newy) {
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

	/*
	 * static void rotateBlock(){ currentBlock }
	 */
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
					actualGame[i][j] = currentBlock.getBlock()[a][b];
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

	// check if line is complete
	boolean CompleteLine(int i) {
		boolean complete = true;
		for (int j = 1; j < 11; j++) {
			if (board.actualGame[i][j] == 0)
				complete = false;
		}

		return complete;
	}

	// check numbers lines are complete
	int numberCompleteLines() {
		int number = 0;
		for (int i = 2; i < numberLin; i++) {
			if (CompleteLine(i))
				number += 1;
		}
		return number;
	}

	/*
	 * // remove lines completes void RemoveLines() {
	 * 
	 * }
	 */

	// Check if you lose
	boolean exit() {
		boolean exit = false;
		for (int j = 1; j < numberCol; j++) {
			if (board.actualGame[1][j] != 0)
				exit = true;
		}
		return exit;
	}

	public static void main(String[] args) {
		int counter = 0;
		RandomBlock();
		while (counter < 3000) {

			if (testMove(currentBlock.getX() + 1, currentBlock.getY())) {
				currentBlock.setX(currentBlock.getX() + 1);
				putBlock();
				printBoard();
			} else {
				clearGame = actualGame;
				printBoard();
			}

			sleep(1000);
			counter++;
		}

	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub

	}

}