package Narrative2.Pedestal4.Door;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Access access = new Access(scanner);
        Door door = new Door(access, scanner);


    }
}
