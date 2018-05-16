package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.string.LeastOccuredCharacter;

public class TestCase_2_LeastOccurredCharacter {

	@Test
	public void testGetFirstNonRepeatedChar_useLinkedHashMap() {
		LeastOccuredCharacter loc = new LeastOccuredCharacter();
		char expValue= loc.firstNonRepeatedCharacter_useHashMap("amaninthecarinthemanr");
		assertEquals(expValue, 'c',0);
	}

}
