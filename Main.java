import java.util.*;

enum Suit {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        String cardValue;
        switch (value) {
            case 1:
                cardValue = "Ace";
                break;
            case 11:
                cardValue = "Jack";
                break;
            case 12:
                cardValue = "Queen";
                break;
            case 13:
                cardValue = "King";
                break;
            default:
                cardValue = String.valueOf(value);
        }
        return cardValue + " of " + suit.toString();
    }




    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        List<Card> hand = deck.drawHand(7);

        System.out.println("Hand:");
        for (Card card : hand) {
            System.out.println(card.toString());
        }

        System.out.println("Remaining cards in the deck: " + deck.getRemainingCards());
    }
}