package VinsTrouble;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrow arrow = new Arrow();

        do {
            System.out.println("Hello dear customer, welcome to my arrow shop!");
            System.out.println("I have premade arrows for beginners, marksmen and elite bowmen. Additionally I can also make custom arrows.");
            System.out.println("Would you like premade or custom arrows?");
            arrow.setPremadeOrCustom(scanner.nextLine());

            if (arrow.getPremadeOrCustom().contains("premade")) {

                System.out.println("The beginner arrows are made from a wood arrowhead, with goose feathers, and a 75 cm shaft.");
                System.out.println("The marksman arrows are made from a steel arrowhead, with goose feathers, and a 65 cm shaft.");
                System.out.println("The elite arrows are made from a steel arrowhead, with plastic fletching, and a 95 cm shaft.");
                System.out.println("Would you like beginner, marksmen or elite arrows?");
                arrow.setPremadeArrow(scanner.nextLine());
                arrow.produceArrow();

                System.out.println("Perfect, you have opted for the " + arrow.getSelectedArrow().name().toLowerCase() + " arrows.");
                System.out.println("That will be " + arrow.getTotal() + " gold, please.");


            } else if (arrow.getPremadeOrCustom().contains("custom")) {

                System.out.println("To make you the perfect set of arrows please let us know your desired arrowhead, shaft length and fletching.");
                System.out.println("What type of arrowhead would you like? We have wood, obsidian and steel.");
                arrow.setInputHead(scanner.nextLine());
                System.out.println();

                System.out.println("Great, what type of shaft length would you like? We have 60, 80 and 100cm.");
                arrow.setInputShaft(scanner.nextLine());
                System.out.println();

                System.out.println("Amazing choice, what type of fletching would you like? We have plastic, turkey and goose feathers");
                arrow.setInputFletch(scanner.nextLine());

                arrow.produceArrow();

                System.out.print("Excellent taste, your arrow wil have " + arrow.getAdjective() + " " + arrow.getSelectedHead().name().toLowerCase() +
                        " arrowhead, with a length of " + arrow.getSelectedShaft().name().toLowerCase() + " and a tail made of" +
                        arrow.getSelectedFletch().name().toLowerCase() + ".");

                System.out.println();
                System.out.println("The total cost is " + arrow.getTotal() + " gold.");

            }
        } while (arrow.getTotal() == 0);
    }
}
