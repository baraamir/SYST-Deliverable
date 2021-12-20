/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author User
 */
public class CardTest {
    

    @Test
    public void testGetValueGood() {
        System.out.println("CheckgetValue good");
        Card instance = new Card();
        CardValue expResult = null;
        CardValue result = instance.getValue();
        assertEquals(expResult, result);
     }

    /**
     * Test of getColor method, of class Card.
     */
    @Test
    public void testGetColorBad() {
        System.out.println("CheckgetColor bad");
        Card instance = new Card();
        CardColor expResult = null;
        CardColor result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValueBad() {
        System.out.println("ChecksetValue good ");
        CardValue value = null;
        Card instance = new Card();
        instance.setValue(value);

    }

    /**
     * Test of setColor method, of class Card.
     */
    @Test
    public void testSetColorGood() {
        System.out.println("ChecksetColor good");
        CardColor color = null;
        Card instance = new Card();
        instance.setColor(color);

    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringBoundry() {
        System.out.println("toString");
        Card instance = new Card();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
