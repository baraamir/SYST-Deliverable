/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Amir Barakat, December 18, 2021
 */
public class GroupOfCards {

    private List<Card> cardPile;
    //The group of cards, stored in an ArrayList
  
    

   public GroupOfCards() {
        this.cardPile = new ArrayList<>();
        for (CardValue value : CardValue.values()) {
            for (CardColor color : CardColor.values()) {
                cardPile.add(new Card(value, color));
            }
        }
    }
 public List<Card> getCardPile() {
        return cardPile;
    }
     /**
      * this a setter to set the cardPile
      * @param cardPile 
      */
    public void setCardPile(List<Card> cardPile) {
        this.cardPile = cardPile;
    }
 
    /**
     * A method that shuffle the deck.
     */
    public void shuffle() {
        Random rand = new Random();
        //Generate two random numbers between 0 to 76
        for (int i = 0; i < 7; i++) {
            int firstCard = rand.nextInt(this.cardPile.size());
            int secondCard = rand.nextInt(this.cardPile.size());
            Collections.swap(cardPile, firstCard, secondCard);
        }
    }

    /**
     *
     * @param player that type of Player Get next card and add to hand of the
     * player
     */
    public void dealCard(Player player) {

        for (int i = 0; i < 7; i++) {
            Card deleteCard = cardPile.remove(0);
            player.getHandOfCards().add(deleteCard);
        }

    }

    /**
     *
     * @return to deal card to the player
     */
    public Card dealCard() {
        Card removedCard = cardPile.remove(0);
        return removedCard;
    }

    /**
     *
     * @return a method to draw a card
     */
    public Card drawCard() {
        if (cardPile.isEmpty()) {
            System.out.println("It is a draw");
        }
        return cardPile.remove(0);
    }

    //Size of the deck for testing purpose
    public int getSizeOfCardPile() {
        return cardPile.size();
    }

    /**
     *
     * @return A String representation of the Object
     */
    @Override
    public String toString() {
        return "Deck{"
                + "cardDeck=" + cardPile
                + '}';
    }
}

