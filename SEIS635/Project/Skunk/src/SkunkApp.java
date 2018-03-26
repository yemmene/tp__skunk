import java.util.Scanner;
public class SkunkApp {
	
	    private PlayerOne p1;
	    private PlayerTwo p2;
	    private Dice dice;
	    private int scoreToWin;
	    void displayGameMenu() {

            System.out.println();

            System.out.println("(1) Start a new game");
            System.out.println("(2) Play one round");
            System.out.println("(3) Who is leading now?");

            System.out.println("(4) Display game results");

            System.out.println("(5) Exit game");

            System.out.print("Choose an option: ");

        }



        void selectGameOption(int optionSelected) {

            switch (optionSelected) {

                case 1:

                    this.startNewGame();

                    break;

                case 2:

                    this.playOneRound(p1);

                   

                    break;

                case 3:

                    this.whoIsLeading();

                    break;

                case 4:

                    this.displayGameInstruction();

                    break;

                default:

                    break;

            }

        }



        void startNewGame() {

            String p1Name;

            String p2Name;



            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter player one name: ");

            p1Name = sc.nextLine();

            System.out.print("Please enter player two name: ");

            p2Name = sc.nextLine();

            System.out.print("Please enter the maximum score required to win: ");

            scoreToWin = sc.nextInt();



            p1 = new PlayerOne(p1Name);

            p2 = new PlayerTwo(p2Name);

            dice = new Dice();

        }



        void playOneRound(PlayerOne p12) {

            int result;



            int firstDiceRoll = dice.roll();

            int secondDiceRoll = dice.roll();

            if (firstDiceRoll == secondDiceRoll) {

                result = (firstDiceRoll + secondDiceRoll) * 2;

                p12.setTotalScore(result);

                System.out.printf("%s rolled %d and %d, "

                        + "and scored %d points(BONUS DOUBLE POINTS), "

                        + "for a total of %d points",

                        p12.getName(), firstDiceRoll, secondDiceRoll,

                        result, p12.getTotalScore()

                );

            } else {

                result = (firstDiceRoll + secondDiceRoll);

                p12.setTotalScore(result);

                System.out.printf("%s rolled %d and %d, "

                        + "and scored %d points, "

                        + "for a total of %d points",

                        p12.getName(), firstDiceRoll, secondDiceRoll,

                        result, p12.getTotalScore()

                );

            }



            System.out.println();

        }



        void whoIsLeading() {

            if (p1.getTotalScore() == p2.getTotalScore()) {

                System.out.format("Its currently a draw, "

                        + "%s has %d, %s has %d",

                        p1.getName(), p1.getTotalScore(),

                        p2.getName(), p2.getTotalScore()

                );

            } else if (p1.getTotalScore() > p2.getTotalScore()) {

                System.out.printf("%s is leading, %s has %d points, "

                        + "%s has %d points",

                        p1.getName(), p1.getName(), p1.getTotalScore(),

                        p2.getName(), p2.getTotalScore());

            } else if (p1.getTotalScore() < p2.getTotalScore()) {

                System.out.format("%s is leading, %s has %d points, "

                        + "%s has %d points.",

                        p2.getName(), p2.getName(), p2.getTotalScore(),

                        p1.getName(), p1.getTotalScore()

                );

            }

        }



        void displayGameInstruction() {

            System.out.println();

            System.out.println("All players roll a dice twice per turn.");

            System.out.println("If 2 dice rolls have the same value, the player scores 2 times the sum two dice rolls.");

            System.out.println("If 2 dice rolls have different values, the player simply scores the sum of two dice rolls.");

            System.out.println("For each player, result is incremented after each turn.");

            System.out.println("First player to reach or exceed the maxScore wins the game");



        }



        boolean checkIfAnyoneHasWon() {

            if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() >= scoreToWin) {

                System.out.println("Its a draw! Both players have exceeded the score limit");

                return true;

            } else if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() < scoreToWin) {

                System.out.format("%s won", p1.getName());

                return true;

            } else if (p1.getTotalScore() < scoreToWin && p2.getTotalScore() >= scoreToWin) {

                System.out.format("%s won", p2.getName());

                return true;

            }

            return false;

        }



    public static void main(String[] args) {

            System.out.println("Welcome to the Skunk game!");



            SkunkApp game = new SkunkApp ();



            int optionSelected;



            while (true) {

                game.displayGameMenu();

                System.out.println();

                Scanner sc = new Scanner(System.in);

                optionSelected = sc.nextInt();



                while (optionSelected > 5 || optionSelected < 0) {



                    System.out.print("Option entered invalid, please enter a number from 1 to 5: ");

                    optionSelected = sc.nextInt();

                }



                if (optionSelected == 5) {

                    System.out.println("Exiting game");

                    break;

                }



                game.selectGameOption(optionSelected);



                boolean anyoneWin = game.checkIfAnyoneHasWon();

                if (anyoneWin) {

                    System.out.println();

                    System.out.println("Game ended.");

                    break;

                }

            }

        }



    }