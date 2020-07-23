package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

public class GameTest {
    private Game game;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void should_return_1_when_play_game_given_1(){
        //give
        int given = 1;
        //when
        Game game = new Game();
        String actual = game.play(given);
        //then
        String expect = "1";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_3() {
        //give
        int given = 3;
        //when
        Game game = new Game();
        String actual = game.play(given);
        //then
        String expect = "Fizz";
        Assertions.assertEquals(expect,actual);
    }
}
