import java.util.Scanner;

public class buyingInventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("The following items are available:");

        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food supplies");

        System.out.println("What number do you want to see the price of?");
        int inventoryItem = Integer.valueOf(scan.nextLine());

        switch (inventoryItem) {
            case 1:
                System.out.println("Rope: 10 gold.");
                break;
            case 2:
                System.out.println("Torches: 15 gold");
                break;
            case 3:
                System.out.println("Climbing Equipment: 25 gold");
                break;
            case 4:
                System.out.println("Clean Water: 1 gold");
                break;
            case 5:
                System.out.println("Machete: 20 gold");
                break;
            case 6 :
                System.out.println("Canoe: 200 gold");
                break;
            case 7:
                System.out.println("Food supplies: 1 gold");
                break;
        }
    }
}
