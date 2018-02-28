import static org.junit.Assert.*;

import org.junit.Test;


public class testDice {

	@Test
	public void test() {
		Dice test= new Dice(2);
		int output = test.getFaceValue();
		assertEquals(12,output);
	}//write down the expected values
	
}
