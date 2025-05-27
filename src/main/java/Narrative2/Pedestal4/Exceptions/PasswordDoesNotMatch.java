package Narrative2.Pedestal4.Exceptions;

public class PasswordDoesNotMatch extends Exception {
    public PasswordDoesNotMatch() {
        System.out.println("Passwords do not match, try again!");
    }
}
