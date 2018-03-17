public abstract class Die {

    private static int DEFAULT_VALUE = 1;
    
    // current value of dice
    private int value;

    // default value of die
    public Die() {
	value = DEFAULT_VALUE;
    }

    // roll the dice
    public abstract int roll();

    
    // get current value
    public int getValue() {
	return value;
    }

    
    // set current value
    protected void setValue(int value) {
	this.value = value;
    }

}
