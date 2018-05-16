/**
 * 
 */
package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.other.LargestSumOfSubArray;

/**
 * @author diana
 *
 */
public class TestCase_1_LargestSumOfSubArray {

	@Test
	public void test() {
		
		int[] arr = {-1,3,2,0,1,2};
		
		LargestSumOfSubArray lsosa = new LargestSumOfSubArray();
		int sumOfLargestSubArr=lsosa.printLargestSumOfSumArray(arr);
		
		assertEquals(sumOfLargestSubArr, 8,0);
	}

}
