
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
		
		
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		//Check for purpose
		/*
		 * for (int i = 0; i < puzzle.length; i++) { for (int j = 0; j < puzzle.length;
		 * j++) { puzzle[i][j] = 0; } }
		 */
		
		
		//Check across
		for (int i = 0; i < 9; i++) {
			 one = 0;
			 two = 0;
			 three = 0;
			 four = 0;
			 five = 0;
			 six = 0;
			 seven = 0;
			 eight = 0;
			 nine = 0;
			for (int j = 0; j < 9; j++) {
				System.out.println("Checking puzzle[" + i + "][" + j + "]");
				if (solution[i][j] < 1 || solution[i][j] > 9) {
					System.out.println("solution[" + i + "][" + j + "] value is out of bounds. Value is " + solution[i][j]);
					return bad2;
				}
				
				switch(solution[i][j]) {
				  case 1:
				    one =+ 1;
				   
				    break;
				  case 2:
					  two =+ 1;
				    break;
				  case 3:
					  three =+ 1;
					    break;
				  case 4:
					   four =+ 1;
					    break;
				  case 5:
					  five =+ 1;
					    break;
				  case 6:
					  six =+ 1;
					    break;
				  case 7:
					  seven =+ 1;
					    break;
				  case 8:
					  eight =+ 1;
					    break;
				  case 9:
					  nine =+ 1;
					    break;
				}
				
				if (one > 1 || two > 1 || three > 1 || four > 1 || five > 1 || six > 1 || seven > 1 || eight > 1 || nine > 1) {
					System.out.println("One of the numbers has been used more then once across");
					return bad2;
				}
				
				if(puzzle[i][j] != 0) {
					if(puzzle[i][j] != solution[i][j]) {
						return bad1;
					}
				}
			}
		}
		
		
		//Check Down
		for (int i = 0; i < 9; i++) {
			 one = 0;
			 two = 0;
			 three = 0;
			 four = 0;
			 five = 0;
			 six = 0;
			 seven = 0;
			 eight = 0;
			 nine = 0;
			for (int j = 0; j < 9; j++) {
				System.out.println("Checking puzzle[" + j + "][" + i + "]");
				
				
				switch(solution[j][i]) {
				  case 1:
				    one =+ 1;
				   
				    break;
				  case 2:
					  two =+ 1;
				    break;
				  case 3:
					  three =+ 1;
					    break;
				  case 4:
					   four =+ 1;
					    break;
				  case 5:
					  five =+ 1;
					    break;
				  case 6:
					  six =+ 1;
					    break;
				  case 7:
					  seven =+ 1;
					    break;
				  case 8:
					  eight =+ 1;
					    break;
				  case 9:
					  nine =+ 1;
					    break;
				}
				
				if (one > 1 || two > 1 || three > 1 || four > 1 || five > 1 || six > 1 || seven > 1 || eight > 1 || nine > 1) {
					System.out.println("One of the numbers has been used more then once across");
					return bad2;
				}
			}
		}
		
		
		//Check Block
		if(solution[0][0] + solution[0][1] + solution[0][2] +solution[1][0] + solution[1][1] + solution[1][2] + solution[2][0] + solution[2][1] + solution[2][2] != 45) {
			System.out.println("Bad block 1");
			return bad2;
		}
		if(solution[0][3] + solution[0][4] + solution[0][5] +solution[1][3] + solution[1][4] + solution[1][5] + solution[2][3] + solution[2][4] + solution[2][5] != 45) {
			System.out.println("Bad block 2");
			return bad2;
		}
		if(solution[0][6] + solution[0][7] + solution[0][8] +solution[1][6] + solution[1][7] + solution[1][8] + solution[2][6] + solution[2][7] + solution[2][8] != 45) {
			System.out.println("Bad block 3");
			return bad2;
		}
		
		if(solution[3][0] + solution[3][1] + solution[3][2] +solution[4][0] + solution[4][1] + solution[4][2] + solution[5][0] + solution[5][1] + solution[5][2] != 45) {
			System.out.println("Bad block 4");
			return bad2;
		}
		if(solution[3][3] + solution[3][4] + solution[3][5] +solution[4][3] + solution[4][4] + solution[4][5] + solution[5][3] + solution[5][4] + solution[5][5] != 45) {
			System.out.println("Bad block 5");
			return bad2;
		}
		if(solution[3][6] + solution[3][7] + solution[3][8] +solution[4][6] + solution[4][7] + solution[4][8] + solution[5][6] + solution[5][7] + solution[5][8] != 45) {
			System.out.println("Bad block 6");
			return bad2;
		}
		
		if(solution[6][0] + solution[6][1] + solution[6][2] +solution[7][0] + solution[7][1] + solution[7][2] + solution[8][0] + solution[8][1] + solution[8][2] != 45) {
			System.out.println("Bad block 7");
			return bad2;
		}
		if(solution[6][3] + solution[6][4] + solution[6][5] +solution[7][3] + solution[7][4] + solution[7][5] + solution[8][3] + solution[8][4] + solution[8][5] != 45) {
			System.out.println("Bad block 8");
			return bad2;
		}
		if(solution[6][6] + solution[6][7] + solution[6][8] +solution[7][6] + solution[7][7] + solution[7][8] + solution[8][6] + solution[8][7] + solution[8][8] != 45) {
			System.out.println("Bad block 9");
			return bad2;
		}
		
		
		
		
		return solution;
	}

}
