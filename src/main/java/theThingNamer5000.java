import java.util.Scanner;

public class theThingNamer5000 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String c = " of Doom";
        // this declares string C
        int d = 3000;
        // this declares integer D, the number 3000

        System.out.println("What kind of thing are we talking about?");
        String a = input.next();

        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next();
        /* String A is whatever the user enters upon request.
        As is String B. */

        System.out.println("The " + b + " " + a + c + " " + d + "!");
    }
}
