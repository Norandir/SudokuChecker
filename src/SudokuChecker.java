
public class SudokuChecker {

	public static void main(String[] args) {
		int [][] puzzle = { {0,7,0,0,0,0,0,0,9}, 
				{5,1,0,4,2,0,6,0,0},
				{0,8,0,0,0,0,7,0,0},
				{0,0,8,0,0,1,3,7,0},
				{0,2,3,0,8,0,0,4,0},
				{4,0,0,9,0,0,1,0,0},
				{9,6,2,8,0,0,0,3,0},
				{0,0,0,0,1,0,4,0,0},
				{7,0,0,2,0,3,0,9,6}};
		
		
		int [][] solution = { {3,7,4,1,6,8,2,5,9}, 
				{5,1,9,4,2,7,6,8,3},
				{2,8,6,3,9,5,7,1,4},
				{6,9,8,5,4,1,3,7,2},
				{1,2,3,7,8,6,9,4,5},
				{4,5,7,9,3,2,1,6,8},
				{9,6,2,8,7,4,5,3,1},
				{8,3,5,6,1,9,4,2,7},
				{7,4,1,2,5,3,8,9,6}};
		
		


		 
		
		
		System.out.println(checkPuzzle(puzzle, solution));
	}
	//renamed to be more clear
	public static int [][] checkPuzzle(int[][]puzzle, int[][]solution) {
		int [][] bad1 = new int [9][9];
		int [][] bad2 = new int [9][9];
		
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				bad1[i][j] = 0;
			}}
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				bad2[i][j] = -1;
			}}
		
		
		
		
		
		//Check across
		int check = Checker.checkAcross(puzzle, solution, bad1, bad2);
		if (check == 1) {
			return bad1;
		}
		else if (check == 2) {
			return bad2;
		}
		
		//Check Down
		check = Checker.checkDown(solution, bad2);
		if (check == 1) {
			return bad1;
		}
		else if (check == 2) {
			return bad2;
		}
		
		
		//Check Block
		check = Checker.checkBlock(solution, bad2);
		if (check == 1) {
			return bad1;
		}
		else if (check == 2) {
			return bad2;
		}
		
		
		
		
		return solution;
	}

}
