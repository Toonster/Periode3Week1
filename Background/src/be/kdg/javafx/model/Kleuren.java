package be.kdg.javafx.model;

/**
 * Hier hoef je niets te wijzigen!
 */
public class Kleuren {
    private String[] colours  = {
            "cornsilk", "chartreuse", "orange",
            "darkkhaki", "goldenrod", "aquamarine",
            "silver", "burlywood", "orchid"
    };

    private int count = 0;

    public String getBackgroundColour() {
        String result = "-fx-background-color: " + colours[count++];
        if (count >= colours.length) count = 0;
        return result;
    }

}
