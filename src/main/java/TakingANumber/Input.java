package TakingANumber;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

    static Scanner scan = new Scanner(System.in);

    int askForNumber(String text) {
        System.out.println(text);
        String input = scan.nextLine();
        return Integer.parseInt(input);
    }

    int min = 0;
    int max = 100;

    int askForNumberInRange(String text, int min, int max) {
        System.out.println(text);
        int velocity = Integer.parseInt(scan.nextLine());
        {
            while (velocity > max || velocity < min) {
                System.out.println(text);
                velocity = Integer.parseInt(scan.nextLine());
            }
            return velocity;
        }
    }
}


