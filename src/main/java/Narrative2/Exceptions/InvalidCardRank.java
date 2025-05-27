package Narrative2.Exceptions;

public class InvalidCardRank extends Exception {
    public InvalidCardRank() {
        System.out.println("This is an invalid card rank, please use numbers or: $, %, ^ or &.");
    }
}
