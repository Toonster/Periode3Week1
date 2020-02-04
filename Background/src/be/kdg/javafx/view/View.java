package be.kdg.javafx.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/01/2016 19:39
 */
public class View extends BorderPane {
    private Button changeButton;

    public View() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.changeButton = new Button("Change colour");
    }

    private void layoutNodes() {
        this.setRight(changeButton);
        setAlignment(changeButton,Pos.BOTTOM_RIGHT);
        setMargin(changeButton, new Insets(10));
    }

    protected Button getChangeButton() {
        return changeButton;
    }


}
