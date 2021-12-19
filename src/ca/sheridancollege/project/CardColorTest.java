/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CardColorTest {
    
    public CardColorTest() {
    }
    

    /**
     * Test of values method, of class CardColor.
     */
    @Test
    public void testValuesGood() {
        System.out.println("values good");
        CardColor[] expResult = null;
        CardColor[] result = CardColor.values();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of valueOf method, of class CardColor.
     */
    @Test
    public void testValueOfBad() {
        System.out.println("valueOf bad");
        String string = "";
        CardColor expResult = null;
        CardColor result = CardColor.valueOf(string);
        assertEquals(expResult, result);

    }

    /**
     * Test of getName method, of class CardColor.
     */
    @Test
    public void testGetNameBoundry() {
        System.out.println("getName");
        CardColor instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class CardColor.
     */
    @Test
    public void testSetNameGood() {
        System.out.println("setName good");
        String name = "";
        CardColor instance = null;
        instance.setName(name);

    }

    /**
     * Test of getIndex method, of class CardColor.
     */
    @Test
    public void testGetIndexGood() {
        System.out.println("getIndex good");
        CardColor instance = null;
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIndex method, of class CardColor.
     */
    @Test
    public void testSetIndexBad() {
        System.out.println("setIndex bad");
        int index = 0;
        CardColor instance = null;
        instance.setIndex(index);

    }

    /**
     * Test of getEnumColor method, of class CardColor.
     */
    @Test
    public void testGetEnumColorBoundry() {
        System.out.println("getEnumColor");
        String color = "";
        CardColor expResult = null;
        CardColor result = CardColor.getEnumColor(color);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class CardColor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CardColor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
