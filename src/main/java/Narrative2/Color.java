package Narrative2;

public class Color {

    private int channelRed;
    private int channelGreen;
    private int channelBlue;

    public Color(int channelRed, int channelGreen, int channelBlue) {
        this.channelRed = channelRed;
        this.channelGreen = channelGreen;
        this.channelBlue = channelBlue;
    }

    public Color() {
    }

    public static final Color white = new Color(255, 255, 255);
    public static final Color Black = new Color(0, 0, 0);
    public static final Color Red = new Color(255, 0, 0);
    public static final Color Orange = new Color(255, 165, 0);
    public static final Color Yellow = new Color(255, 255, 0);
    public static final Color Green = new Color(0, 128, 0);
    public static final Color Blue = new Color(0, 0, 255);
    public static final Color Purple = new Color(128, 0, 128);

    @Override
    public String toString() {
      return ("(" + channelRed + ", " + channelGreen + ", " + channelBlue +  ")");
    }
}




//The pedestal also includes some color names, with a set of numbers indicating their specific values for
//each channel. These are commonly used colors: White (255, 255, 255), Black (0, 0, 0), Red (255, 0, 0),
//Orange (255,165, 0), Yellow (255, 255, 0), Green (0, 128, 0), Blue (0, 0, 255), Purple (128, 0, 128).

//Define a new Color class with fields for its red, green, and blue channels.
//Add appropriate constructors that you feel make sense for creating new Color objects.
//Create final static fields to define the eight commonly used colors for easy access.
//In your main method, make two Color-typed variables. Use a constructor to create a color instance
//and use a static field for the other. Display each of their red, green, and blue channel values.
