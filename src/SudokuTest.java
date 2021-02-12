import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SudokuTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	void testReview() {
		int [][] GI = { {3,7,4,1,6,8,2,5,9}, 
				{5,1,9,4,2,7,6,8,3},
				{2,8,6,3,9,5,7,1,4},
				{6,9,8,5,4,1,3,7,2},
				{1,2,3,7,8,6,9,4,5},
				{4,5,7,9,3,2,1,6,8},
				{9,6,2,8,7,4,5,3,1},
				{8,3,5,6,1,9,4,2,7},
				{7,4,1,2,5,3,8,9,6}};
		


int [][] puzzle = { {0,7,0,0,0,0,0,0,9}, 
					{5,1,0,4,2,0,6,0,0},
					{0,8,0,0,0,0,7,0,0},
					{0,0,8,0,0,1,3,7,0},
					{0,2,3,0,8,0,0,4,0},
					{4,0,0,9,0,0,1,0,0},
					{9,6,2,8,0,0,0,3,0},
					{0,0,0,0,1,0,4,0,0},
					{7,0,0,2,0,3,0,9,6}};

		
assertEquals( GI, SudokuChecker.checkPuzzle(puzzle, GI));


		
	}

}
