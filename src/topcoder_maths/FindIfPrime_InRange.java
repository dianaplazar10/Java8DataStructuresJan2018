package topcoder_maths;
//Sept 17th, 2017

//www.topcoder.com/community/data-science/data-science-tutorials/mathematics-for-topcoders/
//first checks if given number is 0 or divisible by 2.. if yes, then its not prime,
// then check if given number is 1, if yes, then it is prime.
//we now check if given number is divisible by 3 or numbers in increment of 2's after 3.----- (a)
import java.util.Scanner;

public class FindIfPrime_InRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to check if prime:");
		int givenumber   = in.nextInt();
		boolean bool = isPrime(givenumber);
		System.out.println("The given number is prime :" + bool);
	}

	private static boolean isPrime(int givenumber) {
		if(givenumber==0 || givenumber%2==0) return false;
		if(givenumber==1) return true;
		int m= (int) Math.sqrt(givenumber);
		for(int i =3;i<=m;i+=2){ //----- (a)
			if(givenumber%i==0) 	//check if given number is divisible by 3(for loop initiates with 3) or numbers in increment of 2's after 3
				{
					System.out.println(givenumber+" : ");
					return false;
				}
			return true;
		}
		
		return false;
	}

}
