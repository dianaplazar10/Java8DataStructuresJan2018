package com.other;

//Refer: http://www.cs.armstrong.edu/liang/apcs/html/CheckSudokuSolution.html
import java.util.Scanner;

public class CheckSudokuSolution {
  public static void main(String[] args) {
    // Read a Sudoku solution
    //int[][] grid = readASolution();

//    System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
	  System.out.println(isValid(sMatrix) ? "Valid solution" : "Invalid solution");
  }

  
 static int[][] sMatrix = {
		  			{5,3,4,6,7,8,9,1,2},
		  			{6,7,2,1,9,5,3,4,8},
		  			{1,9,8,3,4,2,5,6,7},
		  			{8,5,9,7,6,1,4,2,3},
		  			{4,2,6,8,5,3,7,9,1},
		  			{7,1,3,9,2,4,8,5,6},
		  			{9,6,1,5,3,7,2,8,4},
		  			{2,8,7,4,1,9,6,3,5},
		  			{3,4,5,2,8,6,1,7,9}					  
  				};
  
  
  /** Read a Sudoku solution from the console */
  public static int[][] readASolution() {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a Sudoku puzzle solution:");
    int[][] grid = new int[9][9];
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++)
        grid[i][j] = input.nextInt();

    return grid;
  }

  /** Check whether a solution is valid */
  public static boolean isValid(int[][] grid) {
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++)
        if (grid[i][j] < 1 || grid[i][j] > 9 
            || !isValid(i, j, grid))
          return false;
    return true; // The solution is valid
  }

  /** Check whether grid[i][j] is valid in the grid */
  public static boolean isValid(int i, int j, int[][] grid) {
    // Check whether grid[i][j] is valid at the i's row
    for (int column = 0; column < 9; column++)
      if (column != j && grid[i][column] == grid[i][j])
        return false;

    // Check whether grid[i][j] is valid at the j's column
    for (int row = 0; row < 9; row++)
      if (row != i && grid[row][j] == grid[i][j])
        return false;

    // Check whether grid[i][j] is valid in the 3 by 3 box
    for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
      for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
        if (row != i && col != j && grid[row][col] == grid[i][j])
          return false;

    return true; // The current value at grid[i][j] is valid
  }
}


//Class with basic checking logic : 	refer:http://stackoverflow.com/questions/34076389/java-sudoku-solution-verifier
class BASICSudokuChecker{
	boolean checkIfvalidSudoku(int[][] s)
	{
	// row checker
	for(int row = 0; row < 9; row++)
	   for(int col = 0; col < 8; col++)
	      for(int col2 = col + 1; col2 < 9; col2++)
	         if(s[row][col]==s[row][col2]){
	            return false;}

	// column checker
	for(int col = 0; col < 9; col++)
	   for(int row = 0; row < 8; row++)
	      for(int row2 = row + 1; row2 < 9; row2++)
	         if(s[row][col]==s[row2][col]){
	            return false;}

	// grid checker
	for(int row = 0; row < 9; row += 3)
	   for(int col = 0; col < 9; col += 3)
	      // row, col is start of the 3 by 3 grid
	      for(int pos = 0; pos < 8; pos++)
	         for(int pos2 = pos + 1; pos2 < 9; pos2++)
	            if(s[row + pos%3][col + pos/3]==s[row + pos2%3][col + pos2/3])
	               return false;
	
	return false;
	}
}