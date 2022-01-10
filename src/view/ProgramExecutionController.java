package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgramExecutionController implements Initializable {

    @FXML
    private TextField numberOfActiveProgramStatesTextField;

    @FXML
    private Button oneStepButton;
    @FXML
    private Button allStepButton;

    @FXML
    private TableView symbolTableTableView;
    @FXML
    private TableView heapTableTableView;
    @FXML
    private TableView fileTableTableView;

    @FXML
    private ListView executionStackListView;
    @FXML
    private ListView outListListView;

    @FXML
    private ListView programStateIDsListView;


    @FXML
    public void handleOneStepButtonAction(ActionEvent actionEvent) {
        System.out.println("1 Step Button Pressed");
        // TODO
    }

    @FXML
    public void handleAllStepButtonAction(ActionEvent actionEvent) {
        System.out.println("1 Step Button Pressed");
        // TODO
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }
}
