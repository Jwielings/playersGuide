import java.util.Scanner;

public class theDominionOfKings {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
        int estate = 1;
        int duchy = 3;
        int province = 6;

        System.out.println("How many estates do you own?");
        int estateOwnership = Integer.valueOf(scan.nextLine());

        System.out.println("How many duchies do you own?");
        int duchyOwnership = Integer.valueOf(scan.nextLine());

        System.out.println("How many provinces do you own?");
        int provinceOwnership = Integer.valueOf(scan.nextLine());

        int total = (estate * estateOwnership) + (duchy * duchyOwnership) + (province * provinceOwnership);

        System.out.println("Your total number of points is " + total + ".");

    }
}
