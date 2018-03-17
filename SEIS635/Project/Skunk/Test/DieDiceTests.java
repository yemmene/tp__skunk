import org.junit.Test;
import static org.junit.Assert.*;

// Test for die and dice
public class DieDiceTests {

    // random die rolls
    @Test
    public void test01RandomDieRoll() {
	Die die = new RandomDie();
	// roll 1000 times and check each time value is b/w  1 and 6
	for (int i = 0; i < 1000; i++) {
	    die.roll();
	    assertTrue("Random die roll should be between 1 and 6", die.getValue() >= 1 && die.getValue() <= 6);
	}
    }

    
    // loaded die roll
    @Test
    public void test02LoadedDieRoll() {
	int[] values = { 5, 2, 3, 6, 3, 2, 5, 8, 9, 6, 2 };
	LoadedDie die = createLoadedDie(values);
	assertEquals("Invalid number of loaded values", values.length, die.countLoadedRolls());

	// roll and validate values
	for (int i = 0; i < values.length; i++) {
	    assertEquals("Invalid roll value", values[i], die.roll());
	    assertEquals("Invalid number of loaded values after roll", values.length - i - 1, die.countLoadedRolls());
	}
    }

    @Test
    public void test03DiceRoll() {
	//create loaded die
	int[] values1 = { 5, 2, 3, 6, 3, 2, 5, 8, 9, 6, 2 };
	LoadedDie die1 = createLoadedDie(values1);

	// created loaded ie
	int[] values2 = { 5, 6, 8, 9, 6, 2, 6, 3, 6, 3, 1 };
	LoadedDie die2 = createLoadedDie(values2);

	
	// create dice with loaded die
	Dice dice = new Dice(die1, die2);

	
	// roll and validate totals
	for (int i = 0; i < values1.length; i++) {
	    assertEquals("Invalid roll value", values1[i] + values2[i], dice.roll());
	    assertEquals("Invalid total value", values1[i] + values2[i], dice.total());
	}

    }

    
    
    // helper method to create a loaded die with passed values
    private LoadedDie createLoadedDie(int[] values) {
	LoadedDie die = new LoadedDie();
	for (int i = 0; i < values.length; i++) {
	    die.loadValue(values[i]);
	}

	return die;
    }

}
