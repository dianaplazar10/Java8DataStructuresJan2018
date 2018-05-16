package com.Tests.Practice;

public class Practice_CheckIfNumStrPalindrome {

	public static void main(String[] args) {
		Practice_CheckIfNumStrPalindrome pcnsp = new Practice_CheckIfNumStrPalindrome();
		
		int integer = 334244244;
		String str = "Madams";//
				//"haltyslah";//
				//"holaaloh";//"whats the new World?";
		
		
		pcnsp.checkifPalindrom(integer);
		pcnsp.checkifPalindrom(str);

	}

	private <T> void checkifPalindrom(T obj) {
		if(obj instanceof String)
		{
			String str = ((String) obj).replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			int returnInt = CheckIfStrPalindrome(str);
			if(returnInt==-2) System.out.println("The str is already a palindrome");
			else if(returnInt==-1) System.out.println("Cannot be a palindrome");
			else System.out.println("str is a palindrome with char at index "+ returnInt + " removed");
		}
		if(obj instanceof Integer)
		{
			CheckIfIntPalindrome((int)obj);
		}
		
	}

	
	//remove all special character
		//split the string into 2. Ignore mid char if strlen is odd
		//now iterate n compare 2 substrings.
		private int CheckIfStrPalindrome(String obj) {
			int lowIndex = 0;
			int highIndex= obj.length()-1;
			
			while(lowIndex <= highIndex)
			{
				if(obj.charAt(lowIndex)==obj.charAt(highIndex)) 
				{
					lowIndex++;
					highIndex--;
				}
				else
				{
					if(isPalindrome(obj,lowIndex+1,highIndex)) return lowIndex;
					if(isPalindrome(obj,lowIndex,highIndex-1)) return highIndex;
					return -1;
				}
			}
			return -2;
		}
		
		boolean isPalindrome(String str,int lowIndex,int highIndex)
		{
			while(lowIndex<=highIndex)
			{
				if(str.charAt(lowIndex)== str.charAt(highIndex)) 
				{
					lowIndex++;
					highIndex--;
				}
				else 
					return false;
			}
			return true;
		}

		/*//refer : http://www.programcreek.com/2013/01/leetcode-valid-palindrome-java/
			//using 2 pointers..
			public static boolean isValidPalindrome(String s){
				if(s==null||s.length()==0) return false;
		 
				s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
				System.out.println(s);
		 
				for(int i = 0; i < s.length() ; i++){
					if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
						return false;
					}
				}
		 
				return true;
			}*/
	
	private void CheckIfIntPalindrome(int obj) {
		int temp = obj;
		int sum = 0;
		while(obj>0)
		{
			int r = obj%10;//if obj = 44544,    //r=	4 ,5,5
			sum = (sum*10) + r;					//sum = 4 ,45 = (4*10)+5, 455  =(45*10) + 5
			obj = obj/10;						//n =	45,5,0
		}
		if(temp == sum) System.out.println("Integer is Palindrome");
		else System.out.println("Integer is NOT palindrome");
		
	}
	
	
	//
	
	//remove all special character
		//split the string into 2. Ignore mid char if strlen is odd
		//now iterate n compare 2 substrings.
//		private void CheckIfStrPalindrome(String obj) {
//			obj = obj.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//remove all special character
//			int strLen = obj.length();
//			int midIndex = (strLen%2==0 ? (strLen/2) : ((strLen/2)+1));
//
//				char[] str = obj.substring(0, (strLen%2 == 0)?midIndex : midIndex-1).toCharArray();
//				char[] str2 =  obj.substring(midIndex , obj.length()).toCharArray();
//				boolean strState = false;
//				for (int i = 0; i <str.length; i++) {
//					if(str[i]==str2[str.length-1-i]) strState=true;
//					else strState=false;
//				}
//				if(strState) System.out.println("String is Palindrome");
//				else System.out.println("String is NOT palindrome");
//			
//		}


}
