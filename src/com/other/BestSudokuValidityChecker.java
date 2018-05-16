package com.other;

import java.util.Arrays;

public class BestSudokuValidityChecker{
    static int[][] sMatrix={
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
                
    public static void main(String args[]){
        BestSudokuValidityChecker bsvc = new BestSudokuValidityChecker();
        boolean isSudokuValid = bsvc.isSudokuArrayValid(sMatrix);
        System.out.println(isSudokuValid? "The given 2D 9X9 matrix is a valid sudoku" : "The given 2D 9X9 matrix is NOT a valid sudoku");
    }
    
    //3 rules to check for a sudoku being valid:
    //1) check if all items in each rwo are unique ranging from 0-9
    //2) check in all items in each column are unique ranging from 0-9
    //3) check if all subsudoku are having nique numbers ranging from 0-9
    private boolean isSudokuArrayValid(int[][] sudokuArray){        
        for(int i=0; i<9;i++){
            int[] rowArray=new int[9];
            int[] columnArray=sudokuArray[i].clone();//copying the first item of eash rowArray of the 9X9 array given 
            int[] subSudokuArray=new int[9];
            
            for(int j =0;j<9;j++){
                rowArray[j] = sudokuArray[j][i];
                subSudokuArray[j] = sudokuArray[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];//needs a logic to calculate the index
            }
            
            if(!(isArrayWithUniqueItems(columnArray) 
                && isArrayWithUniqueItems(rowArray) 
                    && isArrayWithUniqueItems(subSudokuArray)))
            {
                return false;
            }
        }return true;
    }//isSudokuArrayValid() method ends
    
    
    private boolean isArrayWithUniqueItems(int[] subArray)
    {
        int i =0;
        Arrays.sort(subArray);
        for(int item : subArray)
        {
            if(item!=++i) 
                return false;
        }
        return true;
    }
    
}