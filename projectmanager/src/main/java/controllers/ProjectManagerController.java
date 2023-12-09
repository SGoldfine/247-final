package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import projectmanager.App;
import model.ProjectManagementSystem;
import model.Project;

public class ProjectManagerController implements Initializable {

    @FXML
    private TextField project_name;
    @FXML
    private Label lbl_error;

    @FXML
    private void onCreateProjectClicked(MouseEvent event) throws IOException {
        // String name = project_name.getText();

        // ProjectManagementSystem pms = ProjectManagementSystem.getInstance();

        // if(!pms.createProject(name)) {
        //     lbl_error.setText("Couldn't create project.");
        //     return;
        // }

        App.setRoot("project_page"); // Navigate to the project page
    }

    @FXML
    private void onProjectClicked(MouseEvent event) throws IOException {
        App.setRoot("project_page");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization logic
        //projectNameField.setText("Project1");
    }
}
