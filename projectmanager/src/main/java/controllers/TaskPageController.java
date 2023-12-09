package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Task;
import projectmanager.App;

public class TaskPageController implements Initializable {
    @FXML
    private TextField txtHoursWorked;
    @FXML
    private TextField txtTaskPriority;
    @FXML
    private TextField txtTaskStatus;
    @FXML
    private Label lblError;
    @FXML
    private TextArea txtAreaComments;
    @FXML
    private TextField txtNewComment;

    @FXML 
    private void onReturnClicked(MouseEvent event) throws IOException {
        App.setRoot("project_manager");
    }

    @FXML 
    private void onLogoutClicked(MouseEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }

    // Initialize the controller
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
}
    
