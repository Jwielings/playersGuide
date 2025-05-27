import java.util.Scanner;

public class Countdown {

    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);

    }

   public static int sum(int k) {
       System.out.println(k);
        if (k > 0) {
            return sum(k-1);
        } else {
            return 0;
        }
    }


}
//for (int x = 10; x > 0; x--)
// System.out.println(x);

