package Narrative2.Pedestal4.Door;

import java.util.Scanner;

public class Door {
    private Access access;
    private State state;


    public Door(Access access, Scanner scanner) throws Exception {
        this.access = access;
        this.state = new State(scanner, access);
        access.makePassword();
        state.firstEncounter();
        access.insertPassword();
        state.firstState();
        state.changeState();

    }

}