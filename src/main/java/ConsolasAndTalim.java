import java.util.Scanner;

public class ConsolasAndTalim {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");
        String first = scanner.nextLine();
        System.out.println("Noted " + first + " got bread.");

    }
}
