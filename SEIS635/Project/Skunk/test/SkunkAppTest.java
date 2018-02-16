import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SkunkAppTest {

	@Before

	public void setUp() throws Exception {

	}


	@Ignore

	public void test() {

		fail("my first test failure");

	}



	@Test

	public void new_dice_can_be_created() {


		Dice d = new Dice();

		assertTrue("new Dice instance not null", d!=null);

	}
}
