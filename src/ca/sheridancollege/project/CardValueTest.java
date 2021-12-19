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
public class CardValueTest {

    @Test
    public void testValuesGood() {
        System.out.println("checkvalues good");
        CardValue[] expResult = null;
        CardValue[] result = CardValue.values();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of valueOf method, of class CardValue.
     */
    @Test
    public void testValueOfBad() {
        System.out.println("checkvalueOf bad");
        String string = "";
        CardValue expResult = null;
        CardValue result = CardValue.valueOf(string);
        assertEquals(expResult, result);

    }

    /**
     * Test of getIndex method, of class CardValue.
     */
    @Test
    public void testGetIndexBad() {
        System.out.println("getIndex bad");
        CardValue instance = null;
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIndex method, of class CardValue.
     */
    @Test
    public void testSetIndexGood() {
        System.out.println("setIndex good");
        int index = 0;
        CardValue instance = null;
        instance.setIndex(index);

    }

    /**
     * Test of getName method, of class CardValue.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName good");
        CardValue instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class CardValue.
     */
    @Test
    public void testSetNameBad() {
        System.out.println("setName bad");
        String name = "";
        CardValue instance = null;
        instance.setName(name);

    }

    /**
     * Test of toString method, of class CardValue.
     */
    @Test
    public void testToStringBoundry() {
        System.out.println("toString");
        CardValue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
