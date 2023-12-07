package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import projectmanager.App;
import model.ProjectManagementSystem;
import model.Project;

public class ProjectManagerController implements Initializable {

    @FXML
    private TextField projectNameField;

    @FXML
    private void onCreateProjectClicked(MouseEvent event) {
        String projectName = projectNameField.getText();
        Project newProject = new Project(projectName); // Replace with the actual constructor
        ProjectManagementSystem pms = ProjectManagementSystem.getInstance();
        
        // Assuming a method to handle project creation
        //pms.handleProjectCreation(newProject); 

        try {
            App.setRoot("project_page"); // Navigate to the project page
        } catch (IOException e) {
            e.printStackTrace(); // Log an error or inform the user
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization logic
        //projectNameField.setText("Project1");
    }
}
