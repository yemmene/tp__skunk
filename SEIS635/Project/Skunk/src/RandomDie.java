import java.util.Random;

// Die with random roll
public class RandomDie extends Die {

    // to generate random numbers
    private Random random;

    // create a new random die
    public RandomDie() {
	random = new Random();
    }

    
    // roll die
    @Override
    public int roll() {
	setValue(1 + random.nextInt(6));
	return getValue();
    }

}
