package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.other.LargestSumOfSubArray;

public class TS3_for_AssertNull_LargestSumOfSubArray {

	@Test
	public void test() {
		int[] arr = null;//{-1,3,2,0,1,2};		
		LargestSumOfSubArray lsosa = new LargestSumOfSubArray();
		int sumOfLargestSubArr=lsosa.printLargestSumOfSumArray(arr);
		
		assertNull(sumOfLargestSubArr);//assertNul fails if the method returns a null.. hence when it fails.. we need to check for nullity. weird huh?
		
	}

}
