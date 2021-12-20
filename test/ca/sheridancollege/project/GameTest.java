/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author User
 */
public class GameTest {

    @Test
    public void testGetPlayersGood() {
        System.out.println("getPlayers good");
        Game instance = new Game();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayersBad() {
        System.out.println("setPlayers bad");
        ArrayList<Player> players = null;
        Game instance = new Game();
        instance.setPlayers(players);

    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinnerBoundry() {
        System.out.println("declareWinner");
        Game instance = new Game();
        instance.declareWinner();

    }
    
}
