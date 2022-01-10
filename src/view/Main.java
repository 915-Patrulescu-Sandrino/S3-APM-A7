package view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utils.FSUtils;

import java.io.IOException;
import java.net.URL;
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

        // Program Execution Stage
        GridPane programExecutionGridPane = (GridPane) FXMLLoader.load(Objects.requireNonNull(getClass().getResource(programExecutionFXMLName)));
//        GridPane programExecutionGridPane = new GridPane(); // interchange with the one above
//        programExecutionGridPane.setPadding(new Insets(20));
//        programExecutionGridPane.setVgap(20);
//        programExecutionGridPane.setHgap(20);
//        programExecutionGridPane.setAlignment(Pos.CENTER);
//
//        // Active Program States
//        Text activeProgramStates = new Text("Active Program States:");
//        TextField numberOfActiveProgramStates = new TextField();
//        HBox activeProgramStatesHBox = new HBox(2);
//        activeProgramStatesHBox.getChildren().addAll(activeProgramStates, numberOfActiveProgramStates);
//        programExecutionGridPane.add(activeProgramStatesHBox, 0, 0);
//
//        // Run Buttons
//        Button oneStepButton = new Button("1 Step");
//        Button allStepButton = new Button("All Step");
//        VBox runButtonsVBox = new VBox(2);
//        runButtonsVBox.getChildren().addAll(oneStepButton, allStepButton);
//        programExecutionGridPane.add(runButtonsVBox, 1, 0);
//
//        // TODO: TableView: SymbolTable (Symbol, Value)
//        //
//        // programExecutionGridPane.add(tableViewSymbolTable, 0, 1);
//
//        // TODO: TableView: Heap (Address, Value)
//        //
//        // programExecutionGridPane.add(tableViewHeap, 1, 1);
//
//        // TODO: TableView: FileTable (ID, File)
//        //
//        // programExecutionGridPane.add(tableViewFileTable, 2, 1);
//
//        // VBox of ExecutionStack and OutList
//        // TODO: ListView: ExecutionStack
//        //
//        // TODO: ListView: OutList
//        //
//        HBox lastRow = new HBox(2);
////        lastRow.getChildren().addAll(listViewExecutionStack, listViewOutList);
//        programExecutionGridPane.add(lastRow, 0, 2, 3, 1);
//
//        // TODO: ListView of ProgramState IDs
//        //
////        programExecutionGridPane.add(listViewProgramStates, 3, 0, 1, 3);

        Scene programExecutionScene = new Scene(programExecutionGridPane, 500, 500);
        programExecutionStage.setScene(programExecutionScene);
        programExecutionStage.setTitle("Program Execution");
        programExecutionStage.show();


        // Program Selection Stage
        // TODO: ListView of Programs (IStatement.toString())
        //
//        Button loadButton = new Button("Load");
//        HBox loadButtonHBox = new HBox(10);
//        loadButtonHBox.setAlignment(Pos.BOTTOM_LEFT);
//        loadButtonHBox.getChildren().add(loadButton);
//        VBox programSelectionVBox = new VBox(2);
//        loadButton.setOnAction(e -> {System.out.println("pressed loadButton");});
//        programSelectionVBox.getChildren().addAll(loadButtonHBox); // TODO include listViewProgramStates
//        Scene programSelectionScene = new Scene(programSelectionVBox);

        VBox programSelectionVBox2 = (VBox)FXMLLoader.load(Objects.requireNonNull(getClass().getResource(programSelectionFXMLName)));
        Scene programSelectionScene2 = new Scene(programSelectionVBox2);

        Stage programSelectionStage = new Stage();
        programSelectionStage.setScene(programSelectionScene2); // programSelectionScene/programSelectionScene2
        programSelectionStage.setTitle("Program Selection");
        programSelectionStage.show();
    }
}
// compile + run:
// javafxc -d out/production/A7/ -sourcepath src/ src/view/Main.java && javafx -classpath out/production/A7 view.Main
