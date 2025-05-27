package Narrative2.Pedestal4.Door.Exceptions;

public class TheDoorCantDoThat extends Exception  {
    public TheDoorCantDoThat() {
      System.out.println("The door can't do that. You can only open, close and lock it." +
              "An open door can always be closed.\n" +
              "A closed (but not locked) door can always be opened.\n" +
              "A closed door can always be locked.\n" +
              "A locked door can be unlocked, but the passcode is needed, and the door will only unlock if\n" +
              "the code supplied matches the door’s current passcode.");
    }
}
