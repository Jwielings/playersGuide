package VinFletchersArrows;

import java.util.Scanner;

public class Shaft {
    Scanner scanner = new Scanner(System.in);

    int shaftPrice;
    String inputLength;
    shaftLength selectedShaft;

    enum shaftLength {
        CM60,
        CM80,
        CM100;
    }

    public void choiceOfShaft() {

        do {
            shaftPrice = 0;

            System.out.println("What type of shaft would you like? We have:");
            System.out.println("60cm, 80cm and 100cm.");
            inputLength = scanner.nextLine();

            if (inputLength.contains("60")) {
                selectedShaft = shaftLength.CM60;
                shaftPrice = 3;
            } else if (inputLength.contains("80")) {
                selectedShaft = shaftLength.CM80;
                shaftPrice = 4;
            } else if (inputLength.contains("100")) {
                selectedShaft = shaftLength.CM100;
                shaftPrice = 5;
            }
        } while (shaftPrice == 0) ;

        System.out.println("You have selected " + selectedShaft.name().toLowerCase() + ". Excellent choice!");
        System.out.println();
    }
}


