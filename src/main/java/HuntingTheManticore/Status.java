package HuntingTheManticore;
import java.util.Scanner;

public class Status {

    Scanner scan = new Scanner(System.in);

    private int round;
    private int dmg;
    private int desiredCannonRange;

    private Manticore manticore;
    private Consolas consolas;

    public Status(Manticore manticore, Consolas consolas) {
        this.manticore = manticore;
        this.consolas = consolas;
        this.manticore.setNewHp(manticore.getStartHp());
        this.consolas.setNewHp(consolas.getStartHp());
    }

    public void currentStatus() {


        while (consolas.getNewHp() != 0 && manticore.getNewHp() != 0) {

            round += 1;
            System.out.println("Enter desired cannon range!");
            setDesiredCannonRange(Integer.parseInt(scan.nextLine()));
            System.out.println("STATUS: round: " + round + " City: " + consolas.getNewHp() + "/" + consolas.getStartHp() + " Manticore: " + manticore.getNewHp() + "/" + manticore.getStartHp());
            System.out.println("The cannon is expected to deal " + getDmg() + " damage this round.");
            System.out.println("Entered desired cannon range: " + getDesiredCannonRange());

            if (getDesiredCannonRange() > manticore.getDistanceToCity()) {
                System.out.println("That round OVERSHOT the target.");
                consolas.setNewHp(consolas.getNewHp() - 1);
            } else if (getDesiredCannonRange() < manticore.getDistanceToCity()) {
                System.out.println("That round FELL SHORT of the target.");
                consolas.setNewHp(consolas.getNewHp() - 1);
            } else {
                System.out.println("That round was a DIRECT HIT!");
                manticore.setNewHp(manticore.getStartHp() - getDmg());
            }
            if (manticore.getNewHp() == 0) {
                System.out.println("The Manticore is defeated!");
            } else if (consolas.getNewHp() == 0) {
                System.out.println("Consolas was destroyed. :(");
            }
        }
    }

    public int getRound() {
        return round;
    }

    public int getDmg() {
        if (getRound() % 3 == 0 && getRound() % 5 == 0) {
            dmg = 10;
        } else if (getRound() % 3 == 0 || getRound() % 5 == 0) {
            dmg = 3;
        } else {
            dmg = 1;
        }
        return dmg;
    }

    public int getDesiredCannonRange() {
        return desiredCannonRange;
    }

    public void setDesiredCannonRange(int desiredCannonRange) {
        this.desiredCannonRange = desiredCannonRange;
    }
}


