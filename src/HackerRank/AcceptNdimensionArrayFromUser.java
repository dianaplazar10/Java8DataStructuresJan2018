package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptNdimensionArrayFromUser {

	public static void main(String[] args) {
		int[][] rowArray = null;
        rowArray = acceptPrint_N_DimensionMatrix(rowArray);
        System.out.println("------------------------------------");
        int[] diagItem_lf2rt = new int[rowArray.length];
		int[] diagItem_rt2lt = new int[rowArray.length];
        printDiffBtwSumOfDiagonalElements(rowArray, diagItem_lf2rt, diagItem_rt2lt);
    }

	private static void printDiffBtwSumOfDiagonalElements(int[][] rowArray,int[] diagItem_lf2rt,int[] diagItem_rt2lt) {
		
		for (int i = 0; i < rowArray.length; i++) {
			for (int j = 0; j < diagItem_rt2lt.length; j++) {
				if(j==i) 
	        	{	
	        		diagItem_lf2rt[i] = rowArray[j][i];	//--------------------------------------(A)
	        	}
	        	if(j==rowArray.length-i-1) 
	        	{	
	        		diagItem_rt2lt[i] = rowArray[rowArray.length-i-1][i];//--------------------------------------(B)
	        	}
			}
		}
		
		int sumlt2rt = Arrays.stream(diagItem_lf2rt).sum();
		int sumrt2lt = Arrays.stream(diagItem_rt2lt).sum();
		System.out.println("---------------------------------------");
		int diffOfSumOfDiagonalElements = Math.abs(sumrt2lt-sumlt2rt);
		System.out.println("diff Of Sum Of DiagonalElements ----->" + diffOfSumOfDiagonalElements);
		
	}

	/**
	 * @return 
	 * 
	 */
	private static int[][] acceptPrint_N_DimensionMatrix(int[][] rowArray) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the preferred matrix-->");
        int matrixDimension = sc.nextInt();
        
        rowArray = new int[matrixDimension][matrixDimension];
            
        System.out.println("Enter the integers that fills the array of the dimension you provided");
        for(int i=0; i<(matrixDimension);i++)
        {
            for(int j =0; j<matrixDimension;j++)
            {
                rowArray[j][i] = sc.nextInt();
            }
            
        }
        System.out.print("{");
        for(int i=0; i<(matrixDimension);i++)
        {
        	if(i!=0) System.out.print(",");
        	System.out.print("{");
            for(int j =0; j<matrixDimension;j++)
            {
                System.out.print(rowArray[j][i]+((j!=matrixDimension-1)?",":""));
            }
            System.out.print("}");
        }
        System.out.println("}");
        return rowArray;
	}

}
