package junit5.tdd;

public class Countoff {
    private int gameNumber;

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }
    public String play(int number){
        String result;
        this.gameNumber = number;
        if(number % 3 == 0){
            result = "Fizz";
        }else {
            result = String.valueOf(gameNumber);
        }
        return result;
    }
}