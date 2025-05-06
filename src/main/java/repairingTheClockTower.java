import java.util.Scanner;

public class repairingTheClockTower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        int tickOrTock = number % 2;

        if (tickOrTock == 0) {
            System.out.println("Tick");
        } else {
            System.out.println("Tock");
        }
    }
}
