package Narrative3.RockPaperScissors;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Game {

    Roll roll = new Roll();
    Player p1 = new Player("Jan");
    Player p2 = new Player("Henk");
    ArrayList<Player> players = new ArrayList<>();



    void addPlayers() {
        players.add(p1);
        players.add(p2);
    }


    void playGame() {
        addPlayers();
        Rules rules = new Rules();

        for (int i = 0; i < players.size(); i++) {
            int choice = roll.makeChoice();
            Rules.RPS move = rules.rules(choice);
            players.get(i).setChoice(move);
            System.out.println(players.get(i).name + " chose " + move);
        }

        String result = rules.decideWinner(p1, p1.getChoice(), p2, p2.getChoice());
        System.out.println(result);
    }
}

