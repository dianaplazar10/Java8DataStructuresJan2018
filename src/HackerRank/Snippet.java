package HackerRank;

import java.util.Scanner;

public class Snippet {
//	   public static void main(String[] args) {
	public static void oldMain() {
			int[][] rowArray = null;
			int diffOfSumOfDiagonalElements = 0;
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter the dimension of the preferred matrix-->");
	        int matrixDimension = sc.nextInt();
	        
	        rowArray = new int[matrixDimension][matrixDimension];
	            
//	        System.out.println("Enter the integers that fills the array of the dimension you provided");
	        for(int i=0; i<(matrixDimension);i++)
	        {
	            for(int j =0; j<matrixDimension;j++)
	            {
	                rowArray[i][j] = sc.nextInt();
	            }
	            
	        }
//	        System.out.print("{");
//	        for(int i=0; i<(matrixDimension);i++)
//	        {
//	        	if(i!=0) System.out.print(",");
//	        	System.out.print("{");
//	            for(int j =0; j<matrixDimension;j++)
//	            {
//	                System.out.print(rowArray[i][j]+((j!=matrixDimension-1)?",":""));
//	            }
//	            System.out.print("}");
//	        }
//	        System.out.println("}");
	       
	       
	        int[] diagItem_lf2rt = new int[matrixDimension];
			int[] diagItem_rt2lt = new int[matrixDimension];
	       
	       for (int i = 0; i < rowArray.length; i++) {
				for (int j = 0; j < diagItem_rt2lt.length; j++) {
					if(j==i) 
		        	{	
		        		diagItem_lf2rt[i] = rowArray[i][j];	//--------------------------------------(A) 
		        		diffOfSumOfDiagonalElements += diagItem_lf2rt[i];
		        	}
		        	if(j==rowArray.length-i-1) 
		        	{	
		        		diagItem_rt2lt[i] = rowArray[i][rowArray.length-i-1];//--------------------------------------(B)
		        		diffOfSumOfDiagonalElements -= diagItem_rt2lt[i];
		        	}
				}
			}
			System.out.println("diff Of Sum Of DiagonalElements ----->" + Math.abs(diffOfSumOfDiagonalElements));
	    }

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	        }
	        
	        
	        int diffOfSumOfDiagonalElements = 0;
	        int[] diagItem_lf2rt = new int[n];
			int[] diagItem_rt2lt = new int[n];
	       
	       for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < diagItem_rt2lt.length; j++) {
					if(j==i) 
		        	{	
		        		diagItem_lf2rt[i] = a[i][j];	//--------------------------------------(A) 
		        		diffOfSumOfDiagonalElements += diagItem_lf2rt[i];
		        	}
		        	if(j==a.length-i-1) 
		        	{	
		        		diagItem_rt2lt[i] = a[i][a.length-i-1];//--------------------------------------(B)
		        		diffOfSumOfDiagonalElements -= diagItem_rt2lt[i];
		        	}
				}
			}
			System.out.println("diff Of Sum Of DiagonalElements ----->" + Math.abs(diffOfSumOfDiagonalElements));
	    }	    
}



//More simple. Without an array


//public static void main(String[] args) {
//        int pSum = 0, sSum = 0, N, input;
//        Scanner in = new Scanner(System.in);
//        N = in.nextInt();
//        
//        for(int i = 0; i < N; i ++){
//            for(int j = 0; j < N; j++){
//                input = in.nextInt();
//                if(i == j){
//                    pSum += input;
//                }
//                if(j == N-(i+1)){
//                    sSum += input;
//                }
//            }
//        }
//        System.out.println(Math.abs(pSum-sSum));
//    }
