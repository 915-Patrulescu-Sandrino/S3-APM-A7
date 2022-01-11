package view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.FSUtils;

import java.io.IOException;
import java.util.Objects;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage programExecutionStage) throws IOException {
        String programExecutionFXMLName = "ProgramExecutionLayout.fxml";
        String programSelectionFXMLName = "ProgramSelectionLayout.fxml";
        String programSelectionCSSName = "programSelection.css";
        FSUtils.copyFile("src/view/" + programExecutionFXMLName, "out/production/A7/view/" + programExecutionFXMLName);
        FSUtils.copyFile("src/view/" + programSelectionFXMLName, "out/production/A7/view/" + programSelectionFXMLName);
        FSUtils.copyFile("src/view/" + programSelectionCSSName, "out/production/A7/view/" + programSelectionCSSName);

        try {
            GridPane programExecutionGridPane = (GridPane) FXMLLoader.load(Objects.requireNonNull(getClass().getResource(programExecutionFXMLName)));
            Scene programExecutionScene = new Scene(programExecutionGridPane, 800, 750);
            programExecutionStage.setScene(programExecutionScene);
            programExecutionStage.setTitle("Program Execution");
            programExecutionStage.show();


            VBox programSelectionVBox = (VBox)FXMLLoader.load(Objects.requireNonNull(getClass().getResource(programSelectionFXMLName)));
            Scene programSelectionScene = new Scene(programSelectionVBox);
            Stage programSelectionStage = new Stage();
            programSelectionStage.setScene(programSelectionScene);
            programSelectionStage.setTitle("Program Selection");
            programSelectionStage.show();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
// VM Options for IntelliJ: --module-path /home/kamui/Programs/javafx-sdk-17.0.1/lib --add-modules javafx.controls,javafx.fxml
// compile + run:
// javafxc -d out/production/A7/ $(find src/ -name "*.java") && javafx -classpath out/production/A7/ view.Main
// jfxr out/production/A7/ src/ view.Main