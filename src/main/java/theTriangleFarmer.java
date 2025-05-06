import java.util.Scanner;

public class theTriangleFarmer {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is the base size of the triangle?");
        int base = Integer.valueOf(scan.nextLine());

        System.out.println("What is the height of the triangle?");
        int height = Integer.valueOf(scan.nextLine());

        int area = base * height / 2;

        System.out.println("The surface area of the triangle is " + area + " square centimeters.");
    }
}
