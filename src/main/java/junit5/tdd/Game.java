package junit5.tdd;

public class Game {
    private int gameNumber;

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }
    public String play(int number){
        this.gameNumber = number;
        String result = String.valueOf(gameNumber);
        return result;
    }
}