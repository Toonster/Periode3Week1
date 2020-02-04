package be.kdg.pensioen.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * LEFT: geboorteJaar
 * CENTER: berekenButton
 * RIGHT: pensioenJaar
 *
 * Insets: TRouBLe
 */
public class PensioenView extends BorderPane {
    private TextField geboorteJaarField;
    private TextField pensioenJaarField;
    private Button berekenButton;

    public PensioenView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.geboorteJaarField = new TextField("19xx");
        geboorteJaarField.setPrefColumnCount(4);
        this.pensioenJaarField = new TextField();
        pensioenJaarField.setEditable(false);
        pensioenJaarField.setPrefColumnCount(4);
        this.berekenButton = new Button("Bereken");
    }

    private void layoutNodes() {
        this.setLeft(this.geboorteJaarField);
        this.setCenter(this.berekenButton);
        this.setRight(this.pensioenJaarField);
        Insets inset = new Insets(0, 10, 0, 10);
        Insets insetPad = new Insets(10, 10, 10, 10);
        setMargin(this.berekenButton,inset);
        setMargin(this.berekenButton,insetPad);
        setMargin(this.geboorteJaarField,insetPad);
        setMargin(this.pensioenJaarField,insetPad);
    }

    protected Button getBerekenButton() {
        return berekenButton;
    }

    protected TextField getGeboorteJaarField() {
        return geboorteJaarField;
    }

    protected TextField getPensioenJaarField() {
        return pensioenJaarField;
    }
}
