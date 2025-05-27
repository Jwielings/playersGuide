package Narrative2.Pedestal4.Exceptions;

public class CanNotChangePassword extends RuntimeException {
    public CanNotChangePassword() {
      System.out.println("We can not proceed, please provide valid input. Y/N");
    }
}
