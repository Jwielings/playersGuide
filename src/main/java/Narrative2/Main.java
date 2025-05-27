package Narrative2;
import Narrative2.Color;
import Narrative2.Pedestal4.Exceptions.CanNotCreateDoor;
import Narrative2.Pedestal4.TheLockedDoor;

public class Main {

    public static void main(String[] args) throws Exception {

        Card card = new Card();
        Color colors = new Color();
        TheLockedDoor door = new TheLockedDoor();

        Point point1 = new Point(2, 3);
        Point point2 = new Point(-4, 0);

        Color white = new Color(255, 255, 255);
        Color black = Color.Black;

//        System.out.println(point1);
//        System.out.println(point2);
//        System.out.println(black);
//        System.out.println(white);

        //card.generateDeck();
        door.createDoor();




    }
}

