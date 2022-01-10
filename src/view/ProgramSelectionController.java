package view;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        programsListListView.setItems(FXCollections.observableList(IStatement.IStatementExamples.examples));
        programsListListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void handleLoadButtonAction(ActionEvent actionEvent) {
        // TODO
        programsListListView.getSelectionModel().selectedItemProperty().addListener(e -> {
            int index = programsListListView.getSelectionModel().getSelectedIndex();
            System.out.println("Pressed Load on " + programsListListView.getItems().get(index).toString());

        });
    }
}
