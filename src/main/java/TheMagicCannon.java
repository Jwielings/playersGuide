import java.util.Scanner;

public class TheMagicCannon {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i + ": normal");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(ANSI_RED + i + ": Fire" + ANSI_RESET);
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println(ANSI_YELLOW + i + ": Electric" + ANSI_RESET);
            } else {
                System.out.println(ANSI_BLUE + i + ": Electric and Fire" + ANSI_RESET);

            }
        }
    }
}




