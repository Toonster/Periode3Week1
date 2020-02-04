package be.kdg.javafx.view;

import be.kdg.javafx.model.Kleuren;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Presenter {
    private Kleuren model;
    private View view;

    public Presenter(Kleuren model, View view) {
        this.model = model;
        this.view = view;
        updateView();
        handleEvents();
    }

    private void updateView() {
        view.setStyle(model.getBackgroundColour());
    }

    private void handleEvents() {
        Button changeButton = view.getChangeButton();
        changeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                updateView();
            }
        });
    }


    public View getView() {
        return view;
    }
}
