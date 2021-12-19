/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * This class is responsible for the colors of the Uno game cards.
 *
 * @author Amir Barakat, December 18, 2021
 */
public enum CardColor {

    RED(0, "Red"),
    YELLOW(1, "Yellow"),
    GREEN(2, "Green"),
    BLUE(3, "Blue"),;
    //data memeber
    private int index;
    private String name;

    //An argument constructor for the index and name.
    private CardColor(int index, String name) {

        this.name = name;
        this.index = index;
        

    }
    //getters and setters for the index and name.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    

    /**
     *
     * @param color as a String
     * @return the color of the card
     */
    public static CardColor getEnumColor(String color) {
        for (CardColor c : CardColor.values()) {
            if (c.name.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return null;
    }

    //Overridding the toString method for Displaying the output.
    @Override
    public String toString() {

        return String.format("%s", this.name);
    }

}
