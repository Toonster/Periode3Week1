package be.kdg.javafx;

import be.kdg.javafx.model.Kleuren;
import be.kdg.javafx.view.Presenter;
import be.kdg.javafx.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Kleuren model = new Kleuren();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(presenter.getView());

        primaryStage.setTitle("Colour");
        primaryStage.setScene(scene);

        primaryStage.setWidth(400);
        primaryStage.setHeight(245);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
