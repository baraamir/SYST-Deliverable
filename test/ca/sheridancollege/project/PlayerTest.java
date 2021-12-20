/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author User
 */
public class PlayerTest {

    @Test
    public void testGetHandOfCardsGood() {
        System.out.println("getHandOfCards good");
        Player instance = new Player();
        List<Card> expResult = null;
        List<Card> result = instance.getHandOfCards();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerIDBad() {
        System.out.println("getPlayerID bad");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);

    }

    /**
     * Test of checkId method, of class Player.
     */
    @Test
    public void testCheckIdBoundry() {
        System.out.println("checkId");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkChar method, of class Player.
     */
    @Test
    public void testCheckCharGood() {
        System.out.println("checkChar good");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of checkUnique method, of class Player.
     */
    @Test
    public void testCheckUniqueBad() {
        System.out.println("checkUnique bad");
        String player1 = "";
        String player2 = "";
        boolean expResult = false;
        boolean result = Player.checkUnique(player1, player2);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerIDBoundry() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = new Player();
        instance.setPlayerID(givenID);

    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
