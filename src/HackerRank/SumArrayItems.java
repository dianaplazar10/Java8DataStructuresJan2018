package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrayItems {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       long arr[] = new long[N];
       for(int i=0;i<N;i++)
       {
           arr[i] =sc.nextLong();       
       }
        long sum = 0;
        sum = Arrays.stream(arr).sum();//==========================
        System.out.println(sum);
    }
}


//Input:
//5
//1000000001 1000000002 1000000003 1000000004 1000000005

//Output:
//5000000015