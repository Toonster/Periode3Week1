package be.kdg.scramble.view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.*;

import java.awt.*;

public class ScramblerView extends GridPane {
    private TextField tekst;
    private Button scrambleButton;

    public ScramblerView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.tekst = new TextField();
        tekst.setPromptText("Enter text");
        this.scrambleButton = new Button("Scramble");
    }

    private void layoutNodes() {
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(10));
        scrambleButton.setMaxHeight(200);
        scrambleButton.setMaxWidth(200);
        this.add(tekst,0,0,5,1);
        this.add(scrambleButton, 3, 1, 2, 5);
    }

    protected TextField getTekst() {
        return tekst;
    }

    protected Button getScrambleButton() {
        return scrambleButton;
    }
}
