package Narrative3.RockPaperScissors;

public class Rules {


   public String decideWinner(Player p1, RPS p1Choice, Player p2, RPS p2Choice) {

       if (p1Choice == p2Choice) return "Draw";
       if (p1Choice == RPS.ROCK && p2Choice == RPS.SCISSORS ||
               p1Choice == RPS.PAPER && p2Choice == RPS.ROCK ||
               p1Choice == RPS.SCISSORS && p2Choice == RPS.PAPER) {
                return (p1.name + " is the winner.");
       }
       else {
           return (p2.name + " is the winner.");
       }
   }

    public RPS rules(int randomRoll) {
        return switch (randomRoll) {
            case 1 -> RPS.ROCK;
            case 2 -> RPS.PAPER;
            case 3 -> RPS.SCISSORS;
            default -> throw new IllegalStateException("Unexpected value: " + randomRoll);
        };
    }

    enum RPS {
        ROCK,
        PAPER,
        SCISSORS;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}