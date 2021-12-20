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
public class GroupOfCardsTest {

    @Test
    public void testGetCardPileGood() {
        System.out.println("getCardPile good");
        GroupOfCards instance = new GroupOfCards();
        List<Card> expResult = null;
        List<Card> result = instance.getCardPile();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCardPile method, of class GroupOfCards.
     */
    @Test
    public void testSetCardPileBad() {
        System.out.println("setCardPile bad");
        List<Card> cardPile = null;
        GroupOfCards instance = new GroupOfCards();
        instance.setCardPile(cardPile);

    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffleBooundry() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffle();

    }

    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCard_PlayerGood() {
        System.out.println("dealCard good");
        Player player = null;
        GroupOfCards instance = new GroupOfCards();
        instance.dealCard(player);

    }

    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCard_0argsBad() {
        System.out.println("dealCard bad");
        GroupOfCards instance = new GroupOfCards();
        Card expResult = null;
        Card result = instance.dealCard();
        assertEquals(expResult, result);

    }

    /**
     * Test of drawCard method, of class GroupOfCards.
     */
    @Test
    public void testDrawCardGood() {
        System.out.println("drawCard good");
        GroupOfCards instance = new GroupOfCards();
        Card expResult = null;
        Card result = instance.drawCard();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSizeOfCardPile method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeOfCardPileBad() {
        System.out.println("getSizeOfCardPile bad");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getSizeOfCardPile();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
    @Test
    public void testToStringBoundry() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
