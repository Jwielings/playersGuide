package VinsTrouble;

public class Arrow {

    private String inputHead;
    private String inputShaft;
    private String inputFletch;
    private String adjective;

    private int headPrice;
    private int shaftPrice;
    private int fletchPrice;
    private double total = 0;

    private arrowhead selectedHead;
    private shaft selectedShaft;
    private fletching selectedFletch;

    private premade selectedArrow;
    private String premadeOrCustom;
    private String premadeArrow;


    //    The Elite Arrow, made from a steel arrowhead, plastic fletching, and a 95 cm shaft.
//    The Beginner Arrow, made from a wood arrowhead, goose feathers, and a 75 cm shaft. 3 + 3 + 3.75
//    The Marksman Arrow, made from a steel arrowhead, goose feathers, and a 65 cm shaft.
//    You can make static methods to make these specific variations of arrows easy.

    public void produceArrow() {

        if (getPremadeOrCustom().contains("premade")) {

            if (getPremadeArrow().contains("begin")) {
                setSelectedArrow(premade.BEGINNER);
                setTotal(9.25);
                setSelectedFletch(fletching.GOOSEFEATHERS);
                setSelectedHead(arrowhead.WOOD);
                setSelectedShaft(shaft.CM75);

            } else if (getPremadeArrow().contains("mark")) {
                setSelectedArrow(premade.MARKSMAN);
                setTotal(16.25);
                setSelectedFletch(fletching.GOOSEFEATHERS);
                setSelectedHead(arrowhead.STEEL);
                setSelectedShaft(shaft.CM65);

            } else if (getPremadeArrow().contains("elite")) {
                setSelectedArrow(premade.ELITE);
                setTotal(24.75);
                setSelectedFletch(fletching.PLASTIC);
                setSelectedHead(arrowhead.STEEL);
                setSelectedShaft(shaft.CM95);
            }

        }

        if (getPremadeOrCustom().contains("custom")) {

            if (getInputHead().contains("wood")) {
                setSelectedHead(arrowhead.WOOD);
                setHeadPrice(3);
                setAdjective("a");
            } else if (getInputHead().contains("obsidian")) {
                setSelectedHead(arrowhead.OBSIDIAN);
                setHeadPrice(5);
                setAdjective("an");
            } else if (getInputHead().contains("steel")) {
                setSelectedHead(arrowhead.STEEL);
                setHeadPrice(10);
            }

            if (getInputShaft().contains("60")) {
                setSelectedShaft(shaft.CM60);
                setShaftPrice(3);
            } else if (getInputShaft().contains("80")) {
                setSelectedShaft(shaft.CM80);
                setShaftPrice(4);
            } else if (getInputShaft().contains("100")) {
                setSelectedShaft(shaft.CM100);
                setShaftPrice(5);
            }

            if (getInputFletch().contains("plastic")) {
                setSelectedFletch(fletching.PLASTIC);
                setFletchPrice(10);
            } else if (getInputFletch().contains("turkey")) {
                setSelectedFletch(fletching.TURKEYFEATHERS);
                setFletchPrice(5);
            } else if (getInputFletch().contains("goose")) {
                setSelectedFletch(fletching.GOOSEFEATHERS);
                setFletchPrice(3);
            }

            if (getSelectedHead().equals(arrowhead.OBSIDIAN)) {
                adjective = "an";
            } else if (getSelectedHead().equals(arrowhead.WOOD) || getSelectedHead().equals(arrowhead.STEEL)) {
                adjective = "a";
            }
            setTotal(getHeadPrice() + getShaftPrice() + getFletchPrice());
        }
    }

    enum arrowhead {
        WOOD,
        OBSIDIAN,
        STEEL

    }

    enum shaft {
        CM60,
        CM65,
        CM75,
        CM80,
        CM95,
        CM100;
    }

    enum fletching {
        PLASTIC,
        TURKEYFEATHERS,
        GOOSEFEATHERS;
    }

    enum premade {
        BEGINNER,
        MARKSMAN,
        ELITE;
    }

    public String getInputHead() {
        return inputHead;
    }

    public void setInputHead(String inputHead) {
        this.inputHead = inputHead;
    }

    public String getInputShaft() {
        return inputShaft;
    }

    public void setInputShaft(String inputShaft) {
        this.inputShaft = inputShaft;
    }

    public String getInputFletch() {
        return inputFletch;
    }

    public void setInputFletch(String inputFletch) {
        this.inputFletch = inputFletch;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public int getHeadPrice() {
        return headPrice;
    }

    public void setHeadPrice(int headPrice) {
        this.headPrice = headPrice;
    }

    public int getShaftPrice() {
        return shaftPrice;
    }

    public void setShaftPrice(int shaftPrice) {
        this.shaftPrice = shaftPrice;
    }

    public int getFletchPrice() {
        return fletchPrice;
    }

    public void setFletchPrice(int fletchPrice) {
        this.fletchPrice = fletchPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public arrowhead getSelectedHead() {
        return selectedHead;
    }

    public void setSelectedHead(arrowhead selectedHead) {
        this.selectedHead = selectedHead;
    }

    public shaft getSelectedShaft() {
        return selectedShaft;
    }

    public void setSelectedShaft(shaft selectedShaft) {
        this.selectedShaft = selectedShaft;
    }

    public fletching getSelectedFletch() {
        return selectedFletch;
    }

    public void setSelectedFletch(fletching selectedFletch) {
        this.selectedFletch = selectedFletch;
    }

    public premade getSelectedArrow() {
        return selectedArrow;
    }

    public void setSelectedArrow(premade selectedArrow) {
        this.selectedArrow = selectedArrow;
    }

    public String getPremadeOrCustom() {
        return premadeOrCustom;
    }

    public void setPremadeOrCustom(String premadeOrCustom) {
        this.premadeOrCustom = premadeOrCustom;
    }

    public String getPremadeArrow() {
        return premadeArrow;
    }

    public void setPremadeArrow(String premadeArrow) {
        this.premadeArrow = premadeArrow;
    }
}


