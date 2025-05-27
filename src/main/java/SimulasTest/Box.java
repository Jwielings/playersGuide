package SimulasTest;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Box {
    Scanner scan = new Scanner(System.in);

    enum state {
        OPEN,
        CLOSED,
        LOCKED,
    }

    state currentState;

    public void stateOfBox() {

        switch (currentState) {

            case OPEN:
                System.out.println("The box is open, what do you want to do?");
                String input1 = scan.nextLine();
                if (input1.contains("close")) {
                    System.out.println("The box is closed, what do you want to do?");
                    currentState = state.CLOSED;
                } else {
                    System.out.println("This is not possible!");
                    input1 = scan.nextLine();
                }
            case CLOSED:
                System.out.println("The box is closed, what do you want to do?");
                String input2 = scan.nextLine();
                if (input2.contains("open")) {
                    System.out.println("The box is opened, what do you want to do?");
                    currentState = state.OPEN;
                } else if (input2.contains("lock")) {
                    System.out.println("The box is locked, what do you want to do?");
                    currentState = state.LOCKED;
                } else {
                    System.out.println("This is not possible!");
                    input2 = scan.nextLine();
                    return;
                }
            case LOCKED:
                System.out.println("The box is locked, what do you want to do?");
                String input3 = scan.nextLine();
                if (input3.contains("unlock")) {
                    System.out.println("The box is unlocked, what do you want to do?");
                    currentState = state.CLOSED;
                } else {
                    System.out.println("This is not possible!");
                    input3 = scan.nextLine();


                }
        }
    }
}

