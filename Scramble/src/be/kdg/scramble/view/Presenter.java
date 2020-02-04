package be.kdg.scramble.view;


import be.kdg.scramble.model.Scrambler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Presenter {

    private Scrambler model;
    private ScramblerView view;

    public Presenter(Scrambler model, ScramblerView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void updateView() {
        view.getTekst().setText(model.getTekst());
    }

    private void addEventHandlers() {
        Button scrambleBtn = view.getScrambleButton();
        scrambleBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                model.setTekst(view.getTekst().getText());
                model.scramble();
                updateView();
            }
        });
    }
}
