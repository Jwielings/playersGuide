package VinFletchersArrows;

public class Arrow {

         public void produceArrow() {

            Arrowhead arrowhead = new Arrowhead();
            Shaft shaft = new Shaft();
            Fletching fletching = new Fletching();

            arrowhead.choiceOfArrowhead();
            shaft.choiceOfShaft();
            fletching.choiceOfFletching();
            int price = arrowhead.arrowheadPrice + shaft.shaftPrice + fletching.fletchingPrice;

            System.out.print("You have selected an arrow with a " + arrowhead.selectedHead.name().toLowerCase() + " arrowhead, " +
            "a length of " + shaft.selectedShaft + " with a " + fletching.selectedFletching.name().toLowerCase() + " fletching.");
            System.out.println("That will be " + price + " gold, please.");


        }
    }







