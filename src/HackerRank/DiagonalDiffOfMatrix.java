/*Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
Input Format :The first line contains a single integer, . The next  lines denote the matrix's rows, 
with each line containing space-separated integers describing the columns.
Output Format: Print the absolute difference between the two sums of the matrix's diagonals as a 
single integer.

Sample Input:
3
11 2 4
4 5 6
10 8 -12

Sample Output
15

Explanation: The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
*/



package HackerRank;

public class DiagonalDiffOfMatrix {

	static int[][] nXnMatrix = {
  			{5,3,4},
  			{6,7,2},
  			{1,9,8}					  
		};
	
	//nXnMatrix[i].clone -- columns.. ie,for i=0-->1stColumn{5,3,4},
	//2nd for(int j) - >rowArray[j] = nXnMatrix[j][i];....for i=0, j=0,1,2-->{5,6,1}
	public static void main(String[] args) {
		
		int[] diagItem_lf2rt = new int[3];
		int[] diagItem_rt2lt = new int[3];
		 for (int i = 0; i < 3; i++) 
		 {
			//int[] columnArray = new int[3];
	        int[] rowArray = nXnMatrix[i].clone();
	
	        for (int j = 0; j < rowArray.length; j ++) {
	        	//columnArray[j] = nXnMatrix[j][i]; // gives the column array
	        	if(j==i) 
	        	{	
	        		diagItem_lf2rt[i] = rowArray[j];	//--------------------------------------(A)
	        		System.out.println("diagItem when i:"+(i)+",j:"+(j)+"-->"+rowArray[j]);
	        	}
	        	if(j==rowArray.length-i-1) 
	        	{	
	        		diagItem_rt2lt[i] = rowArray[rowArray.length-i-1];//--------------------------------------(B)
	        		System.out.println("diagItem2 when i:"+(i)+",j:"+(j)+"-->"+rowArray[rowArray.length-i-1]);
	        	}
	        }
	        System.out.println();System.out.println("--------------------------");
		 }
		 
		 System.out.println("------Left to right diagonal array----------");
		 for (int k = 0; k < diagItem_lf2rt.length; k++) {System.out.print(diagItem_lf2rt[k] + ",");}
		 
		 
		 System.out.println("------right to left diagonal array----------");
		 for (int k = 0; k < diagItem_rt2lt.length; k++) { System.out.print(diagItem_rt2lt[k] + ",");}
		 
	}
}

//-----------------------------------------
 /*
  	int[][] main = 
	{
	    {A1,A2,A3} ,
		{B1,B2,B3} ,
		{C1,C2,C3}	
	}
	
	The above matrix can be represented as nXn matrix... 3X3 matrix
	To iterate over As abd Bs and Cs, its the first for loop
	int[] row --> each element array withing the main element ==> main[i]
	for (int i = 0; i < 3; i++) {
		int[] row = main[i];
	}
	
	
	main[j][i]; implies... jth item in ith row.
	so, if, i=0, j=1==> A2
	
	to obtain {A1, B2, C3}.. left to right, diagonal elements --  check for (i==j) ----(A)
	if(j==i) {	diagItem_lf2rt[i] = rowArray[j];}
	
	to obtain {A3,B2,C3}.. right to left, diagonal elements --  check for (i==arrLength-i-1) ----(B)
	if(j==rowArray.length-i-1) {diagItem_rt2lt[i] = rowArray[rowArray.length-i-1];}
*/
