package view;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import model.statement.IStatement;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgramSelectionController implements Initializable {

    @FXML
    private ListView<IStatement> programsListListView;

    @FXML
    private Button loadButton;

    private IStatement loadedProgram = null;

    public IStatement getLoadedProgram() {
        return loadedProgram; // .deepCopy();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        programsListListView.setItems(FXCollections.observableList(IStatement.IStatementExamples.examples));
        programsListListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void handleLoadButtonAction(ActionEvent actionEvent) {
        // TODO
        int index = programsListListView.getSelectionModel().selectedIndexProperty().get();
        if (index != -1) {
            System.out.println("Pressed Load on: " + programsListListView.getItems().get(index).toString());
            loadedProgram = programsListListView.getItems().get(index);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a program before pressing load button");
            alert.setHeaderText("You didn't select any program to load");
            alert.setTitle("Load without selection");
            alert.showAndWait();
        }


//        TODO: what the hell is this below?
//        programsListListView.getSelectionModel().selectedItemProperty().addListener(e -> {
//            int index = programsListListView.getSelectionModel().getSelectedIndex();
//
//            // TODO notify ProgramExecutionController
//        });
    }
}
