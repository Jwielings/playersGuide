package VinFletchersArrows.Efficient;

import java.util.Scanner;

public class Arrow {
    Scanner scanner = new Scanner(System.in);

    String inputHead;
    String inputShaft;
    String inputFletch;
    String adjective;

    int headPrice;
    int shaftPrice;
    int fletchPrice;
    int total = 0;


    arrowhead selectedHead;
    shaft selectedShaft;
    fletching selectedFletch;

    public void produceArrow() {

        do {

            System.out.println("Hello dear customer, welcome to my arrow shop!");
            System.out.println("To make you the perfect set of arrows please let us know your desired arrowhead, shaft length and fletching.");
            System.out.println("What type of arrowhead would you like? We have wood, obsidian and steel.");

            inputHead = scanner.nextLine();
            System.out.println();

            if (inputHead.contains("wood")) {
                selectedHead = arrowhead.WOOD;
                headPrice = 3;
                adjective = "a";
                String suffix = "en";
            } else if (inputHead.contains("obsidian")) {
                selectedHead = arrowhead.OBSIDIAN;
                headPrice = 5;
                adjective = "an";
            } else if (inputHead.contains("steel")) {
                selectedHead = arrowhead.STEEL;
                headPrice = 10;
            }
            System.out.println("Great, what type of shaft length would you like? We have 60, 80 and 100cm.");
            inputShaft = scanner.nextLine();

            if (inputShaft.contains("60")) {
                selectedShaft = shaft.CM60;
                shaftPrice = 3;
            } else if (inputShaft.contains("80")) {
                selectedShaft = shaft.CM80;
                shaftPrice = 4;
            } else if (inputShaft.contains("100")) {
                selectedShaft = shaft.CM100;
                shaftPrice = 5;
            }

            System.out.println();
            System.out.println("Amazing choice, what type of fletching would you like? We have plastic, turkey and goose feathers");
            inputFletch = scanner.nextLine();

            if (inputFletch.contains("plastic")) {
                selectedFletch = fletching.PLASTIC;
                fletchPrice = 10;
            } else if (inputFletch.contains("turkey")) {
                selectedFletch = fletching.TURKEYFEATHERS;
                fletchPrice = 5;
            } else if (inputFletch.contains("goose")) {
                selectedFletch = fletching.GOOSEFEATHERS;
                fletchPrice = 3;
            }

            if (selectedHead == arrowhead.OBSIDIAN) {
                adjective = "an";
            } else if (selectedHead == arrowhead.WOOD || selectedHead == arrowhead.STEEL) {
                adjective = "a";
            }

            System.out.print("Excellent taste, your arrow wil have " + adjective + " " + selectedHead.name().toLowerCase() +
                    " arrowhead, with a length of " + selectedShaft.name().toLowerCase() + " and a tail made of" +
                    selectedFletch.name().toLowerCase() + ".");

            System.out.println();
            total = headPrice + shaftPrice + fletchPrice;
            System.out.println("The total cost is " + total + " gold.");

        } while (total == 0);
    }


    enum arrowhead {
        WOOD,
        OBSIDIAN,
        STEEL

    }

    enum shaft {
        CM60,
        CM80,
        CM100;
    }

    enum fletching {
        PLASTIC,
        TURKEYFEATHERS,
        GOOSEFEATHERS;
    }
}
