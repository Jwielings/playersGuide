package Narrative2;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    @Override
    public String toString() {
        return ("(" + getX() + ", " + getY() + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }
}

