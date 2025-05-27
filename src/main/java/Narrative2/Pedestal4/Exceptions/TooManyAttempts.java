package Narrative2.Pedestal4.Exceptions;

public class TooManyAttempts extends RuntimeException {
    public TooManyAttempts() {
      System.out.println("Too many attempts, you are blocked from trying again.");
    }
}
