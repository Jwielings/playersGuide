package Narrative2.Exceptions;

public class InvalidCardColor extends Exception {
    public InvalidCardColor() {
      System.out.println("This is not a valid color option, choose red, green blue or yellow");
    }
}
