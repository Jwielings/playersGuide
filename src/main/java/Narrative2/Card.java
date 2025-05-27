package Narrative2;
import java.util.ArrayList;
import java.util.List;

import Narrative2.Exceptions.InvalidCardColor;
import Narrative2.Exceptions.InvalidCardRank;

public class Card {

    String cardRankType;
    String cardColorType;

    Card(String cardRankType, String cardColorType) {
        this.cardRankType = cardRankType;
        this.cardColorType = cardColorType;
    }

    Card() {

    }

    public void generateDeck() {
        List<Card> deck = new ArrayList<>();
        for (Card.cardColor color:  Card.cardColor.values()) {
            for (int num = 2; num <= 10; num++) {
                deck.add(new Card(String.valueOf(num), color.name()));
            }
            for (String symbol : new String[]{"$", "%", "^", "&"}) {
                deck.add(new Card(symbol, color.name()));
            }
        }
        for (Card c : deck) {
            System.out.println("The " + c.cardColorType.toLowerCase()    + " " + c.cardRankType);
        }

    }

    public enum cardColor {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }

    public enum cardRank {
        NUMBERCARD,
        SYMBOLCARD
    }


    cardColor cardColorCheck(String cardColorType) throws Exception {
        return switch (cardColorType.toLowerCase()) {
            case "red" -> cardColor.RED;
            case "green" -> cardColor.GREEN;
            case "blue" -> cardColor.BLUE;
            case "yellow" -> cardColor.YELLOW;
            default -> throw new InvalidCardColor();
        };
    }

    cardRank cardRankCheck (String cardRankType) throws Exception {
        return switch (cardRankType.toLowerCase()) {
            case "$", "%", "^", "&" -> cardRank.SYMBOLCARD;
            case "2", "3", "4", "5", "6", "7", "8", "9", "10" -> cardRank.NUMBERCARD;
            default -> throw new InvalidCardRank();
        };
    }
}

