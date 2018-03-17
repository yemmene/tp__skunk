import java.util.ArrayList;

public class LoadedDie extends Die{

    // list of loaded values
    private ArrayList<Integer> values;

    
    // create an empty loaded die
    public LoadedDie() {
	values = new ArrayList<>();
    }
    
    
    // load value to die
    public void loadValue(int value) {
	values.add(value);
    }
    
    
    // count total rolls remianing in loaded die
    public int countLoadedRolls(){
	return values.size();
    }

    // roll die
    @Override
    public int roll() {
	// set value ot first valuye in list and remove it
	setValue(values.remove(0));
	return getValue();
    }
    
    
    
    
}
