package HuntingTheManticore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Manticore manticore = new Manticore(10);
        Consolas consolas = new Consolas(15);


        manticore.askForDistance();

        Status status = new Status(manticore, consolas);
        status.currentStatus();







    }
}
