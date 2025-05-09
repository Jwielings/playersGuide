import java.util.Scanner;

public class thePrototype {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("User 1, enter a number between 1 and 100:");
        int location = Integer.parseInt(scan.nextLine());

        while (location < 0 || location > 100) {
            System.out.println("User 1, please make sure to re-enter a number between 1 and 100:");
            location = Integer.parseInt(scan.nextLine());
        }

        for (int i = 1; i < 50; i++) {
            System.out.println();
        }

        System.out.println("User 2, guess the number");
        int guess = Integer.parseInt(scan.nextLine());

        while (guess < location) {
            System.out.println(guess + " is too low.");
            System.out.println("What is your next guess?");
            guess = Integer.parseInt(scan.nextLine());

        } while (guess > location) {
            System.out.println(guess + " is too high.");
            System.out.println("What is your next guess?");
            guess = Integer.parseInt(scan.nextLine());

        } if (guess == location) {
            System.out.println("You guessed the number!");
        }
    }
}







