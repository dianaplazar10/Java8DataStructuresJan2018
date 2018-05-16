package com.other;

//refer: http://codereview.stackexchange.com/questions/46033/sudoku-checker-in-java
import java.util.Arrays;

public class BestSudokuCheckerSolution {
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
	
	
	private boolean isSudokuArrayValid(int[][] suDokuArray) {
	    for (int i = 0; i < 9; i++) {
	
	        int[] rowArray = new int[9];
	        int[] subSudokuArray = new int[9];
	        int[] columnArray = suDokuArray[i].clone();
	
	        for (int j = 0; j < 9; j ++) {
	        	rowArray[j] = suDokuArray[j][i];
	            //System.out.print("rowArray["+j+"] = suDokuArray["+j+"]["+i+"] ::: " + rowArray[j] + " = " + suDokuArray[j][i] +"----------");
	            //System.out.println(" for   i="+i+";j="+j+"; then , suDokuArray[" + ((i / 3) * 3 + j / 3) + "][" +(i * 3 % 9 + j % 3)+"]") ;
	            subSudokuArray[j] = suDokuArray[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
	        }
	        //System.out.println("-------------------------------------");
	        if (!(isArrayWithUniqueItems(columnArray) 
	        		&& isArrayWithUniqueItems(rowArray) 
	        			&& isArrayWithUniqueItems(subSudokuArray)))
	            return false;
	    }
	    return true;
	}
	
	private boolean isArrayWithUniqueItems(int[] check) {
	    int i = 0;
	    Arrays.sort(check);
	    for (int number : check) {
	        if (number != ++i)
	            return false;
	    }
	    return true;
	}
	
	
	public static void main(String[] args) {
		BestSudokuCheckerSolution bscs = new BestSudokuCheckerSolution();
	  System.out.println(bscs.isSudokuArrayValid(sMatrix) ? "Valid solution" : "Invalid solution");
  }
}

