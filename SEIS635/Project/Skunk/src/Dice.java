
// Represents a combination of two die
public class Dice {

    // two die
    private Die die1, die2;

    
    // creates two die with two passed die
    public Dice(Die die1, Die die2) {
	this.die1 = die1;
	this.die2 = die2;
    }
    
    // Getters 

    public Dice() {
		// TODO Auto-generated constructor stub
	}

	public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    // roll both die and return the title
    public int roll(){
	die1.roll();
	die2.roll();
	return total();
    }

	int total() {
		// TODO Auto-generated method stub
		return 0;
	}
}
    
