package Narrative2;
import Narrative2.Color;


public class Main {

    public static void main(String[] args) throws Exception {

        Card card = new Card();
        Color colors = new Color();

        Point point1 = new Point(2, 3);
        Point point2 = new Point(-4, 0);

        Color white = new Color(255, 255, 255);
        Color black = Color.Black;

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(black);
        System.out.println(white);

        card.generateDeck();





    }
}

