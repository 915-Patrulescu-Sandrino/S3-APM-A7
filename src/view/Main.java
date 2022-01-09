package view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String fxmlFile = "layout.fxml";
        URL url = getClass().getResource(fxmlFile);
        FXMLLoader loader = new FXMLLoader(url);
        Parent content = loader.load();

        Scene scene = new Scene(content, 500, 500, Color.PINK);
        stage.setTitle("Program Execution");
        stage.setScene(scene);
        stage.show();

        Stage programSelection = new Stage();
        programSelection.setTitle("Program Selection");
        programSelection.setScene(new Scene(new StackPane(), Color.BISQUE));
        programSelection.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
