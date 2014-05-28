package logic;

public class Movement {
	Board board;
	Block currentBlock;
	int lineDele;
	
	

	//check if line is complete
	boolean CompleteLine(int i) {
		boolean complete = true;
		for (int j=1 ; j < 11; j++) {
				if (board.actualGame[i][j] == 0)
					complete=false;
		}
		
		return complete;
	}
	
	//check numbers lines are complete
	int NumberLines() {
		int number=0;
		for (int i=2; i< 22;i++) {
			if (CompleteLine(i)) 
				number += 1;
		}
		return number;
	}
	
	//remove lines completes
	void RemoveLines() {
		
	}
	
	//Check if you lose 
	boolean exit() {
		boolean exit = false;
		for (int j = 1; j < 12; j++) {
			if (board.actualGame[1][j] != 0)
				exit = true;
		}
		return exit;
	}
}
