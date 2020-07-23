package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

public class CountoffTest {
    private Countoff countoff;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void should_return_1_when_play_game_given_1(){
        //give
        int given = 1;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(given);
        //then
        String expect = "1";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_3() {
        //give
        int given = 3;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(given);
        //then
        String expect = "Fizz";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    public void should_return_Buzz_when_play_game_given_5() {
        //give
        int number = 5;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(number);
        //then
        String expect = "Buzz";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    public void should_return_Whizz_when_play_game_given_7() {
        //give
        int number = 7;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(number);
        //then
        String expect = "Whizz";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    public void should_return_FizzBuzz_when_play_game_given_15() {
        //give
        int number = 15;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(number);
        //then
        String expect = "FizzBuzz";
        Assertions.assertEquals(expect,actual);
    }
    @Test
    public void should_return_BuzzWhizz_when_play_game_given_35() {
        //give
        int number = 35;
        //when
        Countoff countoff = new Countoff();
        String actual = countoff.play(number);
        //then
        String expect = "BuzzWhizz";
        Assertions.assertEquals(expect,actual);
    }

}
