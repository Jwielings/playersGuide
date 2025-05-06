import java.util.Scanner;
import java.awt.*;

public class theDefenceOfConsolas {

        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";

        static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Target row?");
        int Row = Integer.valueOf(scan.nextLine());

        System.out.println("Target Column?");
        int Column = Integer.valueOf(scan.nextLine());

        System.out.println("Deploy to");

        System.out.println(ANSI_RED + "(" + Row + ", " + (Column - 1) + ")");
        System.out.println(ANSI_GREEN + "(" + (Row - 1) + ", " + Column + ")");
        System.out.println(ANSI_YELLOW + "(" + Row + ", " + (Column + 1) + ")");
        System.out.println(ANSI_BLUE + "(" + (Row + 1) + ", " + Column + ")");
        Toolkit.getDefaultToolkit().beep();

    }
}
