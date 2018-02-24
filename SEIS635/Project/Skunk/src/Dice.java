import java.util.*;
public class Dice
{

	private int numofsides;
	private int faceValue;
	
	public Dice(int numberofsides)		//constructor
	{
		numofsides = numberofsides;
		
		Random myRandomGenerator = new Random();		
		faceValue = myRandomGenerator.nextInt(numofsides) +1;
		//end of contractor
	}
	
	//This method will simulate rolling the dice object
	public void rollDice()
	{
		Random myRandomGenerator = new Random();		
		faceValue = myRandomGenerator.nextInt(numofsides) +1;
		//end of method rollDice()
	//This method will return the current face value of the dice objects	
	}
	public int getFaceValue()
	{
		return faceValue;
		//end of method getFaceValue
	}
}