public class SkunkApp
{
	public static void main(String[] args)
		{
		
			Dice die1 = new Dice(6);
			Dice die2 = new Dice(6);
			System.out.println("The initial value on our die is: " + die1.getFaceValue());
			
			die1.rollDice();
			System.out.println("The value after rolling our die is: " + die1.getFaceValue());
			
			System.out.println("Let's see how many rolls it takes to get double 1's also known as \"sname eye\"");
			
			int snakEyeCounter = 0;
			while (!(die1.getFaceValue() == 1 && die2.getFaceValue() ==1))
			{
				snakEyeCounter++;
				die1.rollDice();
				die2.rollDice();
				
			}
			
			System.out.printf("\nIt took %d attempts to get snake eyes.\n", snakEyeCounter);
			snakEyeCounter = 0;
			
			for (int counter = 1; counter <=100; counter++)
			{
				if (die1.getFaceValue() == 1 && die2.getFaceValue() ==1)
					snakEyeCounter++;
					die1.rollDice();
					die2.rollDice();
			}
			
			System.out.printf("\nWE received snake eyes "+ snakEyeCounter +" times in 100 rolls,");
		}//end of the main method
		
}