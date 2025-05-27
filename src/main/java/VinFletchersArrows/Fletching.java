package VinFletchersArrows;

import java.util.Scanner;

public class Fletching {
    Scanner scanner = new Scanner(System.in);

    int fletchingPrice;
    String inputType;
    fletchingType selectedFletching;

    enum fletchingType {
        PLASTIC,
        TURKEYFEATHERS,
        GOOSEFEATHERS;
    }

    public void choiceOfFletching() {
        fletchingPrice = 0;

        do {
            System.out.println("What type of fletching would you like? We have:");
            System.out.println("plastic, turkey feathers and goose feathers.");
            inputType = scanner.nextLine();

            if (inputType.contains("plastic")) {
                selectedFletching = fletchingType.PLASTIC;
                fletchingPrice = 10;
            } else if (inputType.contains("turkey")) {
                selectedFletching = fletchingType.TURKEYFEATHERS;
                fletchingPrice = 5;
            } else if (inputType.contains("goose")) {
                selectedFletching = fletchingType.GOOSEFEATHERS;
                fletchingPrice = 3;
            };
        } while (fletchingPrice == 0);

        System.out.println("You have selected " + selectedFletching.name().toLowerCase() + ". Another great choice!");
        System.out.println();
    }
}
