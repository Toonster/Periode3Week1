package be.kdg.dobbelen.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class DobbelenView extends GridPane {
    private ImageView dobbel1;
    private ImageView dobbel2;
    private Button werpButton;

    public DobbelenView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        Image image = new Image("die2.png");
        Image image2 = new Image("die5.png");
        this.dobbel1 = new ImageView(image);
        dobbel1.setFitWidth(100);
        dobbel1.setPreserveRatio(true);
        dobbel1.setSmooth(true);
        this.dobbel2 = new ImageView(image2);
        dobbel2.setFitWidth(100);
        dobbel2.setPreserveRatio(true);
        dobbel2.setSmooth(true);
        this.werpButton = new Button("Werp");
        werpButton.setPrefWidth(80);
    }

    private void layoutNodes() {
        this.add(dobbel1,1,0,4,4);
        this.add(dobbel2,6,0,4,4);
        this.add(werpButton,6,5,3,1);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(10));
    }

    protected Button getWerpButton() {
        return werpButton;
    }

    public ImageView getDobbel1() {
        return dobbel1;
    }

    public ImageView getDobbel2() {
        return dobbel2;
    }
}
