package JUnitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ TestCase_1_LargestSumOfSubArray.class, TestCase_2_LeastOccurredCharacter.class })
public class TestSuite_for_TestCases_1_2 {
	
}
