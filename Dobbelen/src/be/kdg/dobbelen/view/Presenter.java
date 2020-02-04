package be.kdg.dobbelen.view;

import be.kdg.dobbelen.model.Dobbelen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

public class Presenter {
    private Dobbelen model;
    private DobbelenView view;

    public Presenter(Dobbelen model, DobbelenView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        Button werpButton = view.getWerpButton();
        werpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                model.werp();
                updateView();
            }
        });
    }

    private void updateView() {
        int aantalOgen1 = model.getAantalOgen1();
        int aantalOgen2 = model.getAantalOgen2();
        ImageView dobbel1 = view.getDobbel1();
        ImageView dobbel2 = view.getDobbel2();
        dobbel1.setImage(new Image("die" + aantalOgen1 + ".png"));
        dobbel2.setImage(new Image("die" + aantalOgen2 + ".png"));
    }
}
