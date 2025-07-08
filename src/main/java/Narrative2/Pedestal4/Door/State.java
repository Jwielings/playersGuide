package Narrative2.Pedestal4.Door;

import Narrative2.Pedestal4.Door.Exceptions.TheDoorCantDoThat;

import java.util.Scanner;

public class State {

    private Scanner scanner;
    private stateOfDoor doorState;
    private Access access;

    public State (Scanner scanner, Access access) {
        this.scanner = scanner;
        this.access = access;
    }


    public void firstEncounter() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        System.out.println("You encounter a door! It seems like it's locked.");
        setDoorState(currentState("locked"));
        System.out.println("It looks like it needs the password you made to unlock it.");

    }

    public void firstState() {
        System.out.println("You can now unlock it. Type 'unlock' to do so.");
        setDoorState(currentState(scanner.nextLine()));
        System.out.println("The door is now " + getDoorState() + ".");

    }


    public void changeState() throws TheDoorCantDoThat {

        do {

            if (getDoorState().equals(stateOfDoor.LOCKED)) {
                access.insertPassword();
                System.out.println("You can now unlock it. Type 'unlock' to do so.");
                setDoorState(currentState(scanner.nextLine()));
                System.out.println("The door is now " + getDoorState() + ".");
            } else if (getDoorState().equals(stateOfDoor.CLOSED)) {
                System.out.println("Would you like to open or lock it? Type 'open' or 'lock' to do so.");
                setDoorState(currentState(scanner.nextLine()));
                System.out.println("The door is now " + getDoorState() + ".");
            } else if (getDoorState().equals(stateOfDoor.OPEN)) {
                System.out.println("Would you like to close it? Type 'close' to do so.");
                setDoorState(currentState(scanner.nextLine()));
                System.out.println("The door is now " + getDoorState() + ".");
            } else throw new TheDoorCantDoThat();

        } while (true);
    }


    stateOfDoor currentState(String input) {
        return switch (input){
            case "open" -> stateOfDoor.OPEN;
            case "unlock", "close" -> stateOfDoor.CLOSED;
            case "lock" -> stateOfDoor.LOCKED;
            default -> stateOfDoor.UNCHANGED;
        };
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public stateOfDoor getDoorState() {
        return doorState;
    }

    public void setDoorState(stateOfDoor doorState) {
        this.doorState = doorState;
    }

    enum stateOfDoor {
        OPEN,
        CLOSED,
        LOCKED,
        UNLOCKED,
        UNCHANGED
    }

}

