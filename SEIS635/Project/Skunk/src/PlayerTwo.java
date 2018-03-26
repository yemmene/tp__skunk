
public class PlayerTwo {
	private final String name;
    private int totalScore;

    PlayerTwo(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getTotalScore(){
        return totalScore;
    }

    void setTotalScore(int score){
        totalScore += score;
    }

}
