import java.util.Arrays;
import java.util.Scanner;

public class TheReplicatorOfDto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        int first = Integer.parseInt(scan.nextLine());

        System.out.println("What is the second number?");
        int second = Integer.parseInt(scan.nextLine());

        System.out.println("What is the third number?");
        int third = Integer.parseInt(scan.nextLine());

        System.out.println("What is the fourth number?");
        int fourth = Integer.parseInt(scan.nextLine());

        System.out.println("What is the fifth number?");
        int fifth = Integer.parseInt(scan.nextLine());

        int[] array1 = {first, second, third, fourth, fifth};

        int[] array2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
           System.out.println(Arrays.toString(array1));
           System.out.println(Arrays.toString(array2));
        }
    }



