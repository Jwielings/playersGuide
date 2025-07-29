package Narrative3.RockPaperScissors;
import java.util.Random;

public class Roll {

    public int makeChoice() {
        int randomRoll = (int) (Math.random() * 3) + 1;
        return randomRoll;
    }


}
