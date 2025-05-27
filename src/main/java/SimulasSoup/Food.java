package SimulasSoup;
import java.util.Scanner;

public class Food {

    Scanner scanner = new Scanner(System.in);
    String input1;
    String input2;
    String input3;

    public void menu() {

        System.out.println("Welcome to our restaurant! We have:");
        System.out.println("Soup");
        System.out.println("Stew");
        System.out.println("Gumbo");
        System.out.println("What type food would you like?");
        input1 = scanner.nextLine();
        foodType selectedFood = foodType.valueOf(input1.toUpperCase());

        System.out.println("What type flavor would you like? You can choose:");
        System.out.println("Spicy");
        System.out.println("Salty");
        System.out.println("Sweet");
        input2 = scanner.nextLine();
        flavor selectedFlavor = flavor.valueOf(input2.toUpperCase());

        System.out.println("What type main ingredient would you like? You can choose:");
        System.out.println("Mushroom");
        System.out.println("Chicken");
        System.out.println("Carrot");
        System.out.println("Potato");
        input3 = scanner.nextLine();
        mainIngredient selectedMain = mainIngredient.valueOf(input3.toUpperCase());

        System.out.println("Ok, great! One " + selectedFlavor.name().toLowerCase() + " " + selectedMain.name().toLowerCase() + " " + selectedFood.name().toLowerCase() + " coming right up!");
    }

    enum foodType {
        SOUP,
        STEW,
        GUMBO;
    }

    enum flavor {
        SPICY,
        SALTY,
        SWEET;
    }

    enum mainIngredient {
        MUSHROOM,
        CHICKEN,
        CARROT,
        POTATO;

    }
}

