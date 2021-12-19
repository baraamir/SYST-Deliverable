/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Amir Barakat
 */
public  class Card {
    //default modifier for child classes
    CardValue value;
    CardColor color; 
    
      public Card() {
    }
      
       public Card(CardValue value, CardColor color) {
        this.value = value;
        this.color = color;
    }
       
    public CardValue getValue() {
        return value;
    }

    /**
     *
     * @return the color of the card
     */
    public CardColor getColor() {
        return color;
    }
    
    

    /**
     *
     * @param value set the value
     */
    public void setValue(CardValue value) {
        this.value = value;
    }

    /**
     *
     * @param color set the color
     */
    public void setColor(CardColor color) {
        this.color = color;
    }
   
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
@Override
    public String toString() {

        return String.format("Card:%s with color: %s \n", value, color);

    }
}
