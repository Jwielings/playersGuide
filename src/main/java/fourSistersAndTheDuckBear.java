import java.util.Scanner;

public class fourSistersAndTheDuckBear {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int sisters = 4;

        System.out.println("How many chocolate eggs were gathered today?");
        int eggs = Integer.valueOf(scan.nextLine());

        int duckBear = eggs % sisters;
        int sistersEggs = eggs / sisters;

        if (duckBear == 0) {
            System.out.println("The sisters get " + sistersEggs + " eggs. The DuckBear gets none.");
        } else {
            System.out.println("The sisters get " + sistersEggs + " eggs. " + "The DuckBear gets " + duckBear + ".");
        }


    }
}
