package be.kdg.pensioen.view;

import be.kdg.pensioen.model.Pensioen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.awt.*;

public class PensioenPresenter {
    private Pensioen model;
    private PensioenView view;

    public PensioenPresenter(Pensioen model, PensioenView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {
       view.getGeboorteJaarField().setText("19xx");
       view.getPensioenJaarField().setText(Integer.toString(model.getPensioenJaar()));
    }

    private void addEventHandlers() {
        Button berekenButton = this.view.getBerekenButton();
        berekenButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                model.setGeboorteJaar(Integer.parseInt(view.getGeboorteJaarField().getText()));
                updateView();
            }
        });
    }

    public PensioenView getView() {
        return view;
    }
}
