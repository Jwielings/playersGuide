package HuntingTheManticore;
import java.util.Scanner;

public class Manticore {

    static Scanner scan = new Scanner(System.in);

    private int startHp;
    private int distanceToCity;
    private int newHp;

    int maxDistance = 100;
    int minDistance = 0;

    Manticore(int startHp) {
        this.startHp = startHp;
        this.distanceToCity = getDistanceToCity();
    }


    public void askForDistance() {

        System.out.println("Player 1, how far away from the city do you want to station the Manticore?");
        distanceToCity = Integer.parseInt(scan.nextLine());

        while (distanceToCity > maxDistance || distanceToCity < minDistance) {
            System.out.println("Please retry, give a distance between " + minDistance + " and " + maxDistance + "!");
            distanceToCity = Integer.parseInt(scan.nextLine());

        } if ((distanceToCity < maxDistance && distanceToCity > minDistance)){
            for (int i = 0; i < 50; i++) {
                System.out.println();
            } System.out.println("Thank you! We will now start the game.");
        }
    }

    public int getStartHp() {
        return startHp;
    }

    public void setStartHp(int startHp) {
        this.startHp = startHp;
    }

    public int getDistanceToCity() {
        return this.distanceToCity;
    }

    public void setDistanceToCity(int distanceToCity) {
        this.distanceToCity = distanceToCity;
    }

    public int getNewHp() {
        return newHp;
    }

    public void setNewHp(int newHp) {
        this.newHp = newHp;
    }
}







