package Narrative2.Pedestal4.Door;

import java.util.Scanner;

public class Door {
    private Access access = new Access();
    private State state = new State(access);


    public Door() throws Exception {
        access.makePassword();
        state.firstEncounter();
        access.insertPassword();
        state.firstState();
        state.changeState();

    }

}