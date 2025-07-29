package Narrative3.RockPaperScissors;

public class Player {
    String name;
    private Rules.RPS choice;


    public Player(String name) {
        this.name = name;
    }

    public Rules.RPS getChoice() {
        return choice;
    }

    public void setChoice(Rules.RPS choice) {
        this.choice = choice;
    }
}
