package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 19/04/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game("Rock");
    }

    @Test
    public void canGetHandOne(){
        String result = game.getHandOne();
        assertEquals("Rock", result);
    }

//    @Test
//    public void testResult(){
//        assertEquals("Player Wins by playing Rock", game.getResult());
//    }

    @Test
    public void testRandomHandTwo(){
        Game game2 = new Game("Rock");
        String result = game.getComputerHand();
        assertNotNull(result);

    }


}
