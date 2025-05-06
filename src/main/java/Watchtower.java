import java.util.Scanner;

public class Watchtower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a coordinate on the X axis");
        int x = Integer.valueOf(scan.nextLine());

        System.out.println("Give a coordinate on the Y axis");
        int y = Integer.valueOf(scan.nextLine());

        if (y > 0 && x > 0) {
            System.out.println("The enemy is to the northeast!");
        } else if (y > 0 && x < 0 ) {
            System.out.println("The enemy is to the northwest!");
        } else if (y < 0 && x > 0) {
            System.out.println("The enemy is to the southeast!");
        } else if (y < 0 && x < 0) {
            System.out.println("The enemy is to the southwest!");
        } else {
            System.out.println("The enemy is here!");
        }
    }
}
