package VinFletchersArrows;

import java.util.Scanner;

public class Arrowhead {
    Scanner scanner = new Scanner(System.in);

    int arrowheadPrice;
    String input;
    arrowHead selectedHead;

    enum arrowHead {
        STEEL,
        WOOD,
        OBSIDIAN;
    }

    public void choiceOfArrowhead() {
        arrowheadPrice = 0;

        do {
            System.out.println("What type of arrowhead would you like? We have:");
            System.out.println("Wood, steel and obsidian.");
            input = scanner.nextLine();

            if (input.contains("steel")) {
                selectedHead = arrowHead.STEEL;
                arrowheadPrice = 10;
            } else if (input.contains("wood")) {
                selectedHead = arrowHead.WOOD;
                arrowheadPrice = 3;
            } else if (input.contains("obsidian")) {
                selectedHead = arrowHead.OBSIDIAN;
                arrowheadPrice = 5;
            }
        } while (arrowheadPrice == 0);

        System.out.println("You have selected " + selectedHead.name().toLowerCase() + ". Great choice!");
        System.out.println();
    }
}


