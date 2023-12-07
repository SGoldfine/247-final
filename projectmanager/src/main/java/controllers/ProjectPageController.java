package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import projectmanager.App;
import model.Project;
import model.Task;

public class ProjectPageController implements Initializable {

    @FXML
    private ListView<Task> tasksListView;

    private Project currentProject; // Assuming you have a reference to the current project

    @FXML
    private void onAddTaskClicked(MouseEvent event) {
        Task newTask = createNewTask(); // Replace with the actual method to create a new task
        //currentProject.addTask(newTask); // Assuming the Project class has an addTask method
        tasksListView.getItems().add(newTask);
    }

    private Task createNewTask() {
        // Logic to create a new task, replace this with your actual task creation logic
        return new Task("New Task"); // Replace with the actual constructor
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the controller, like setting the current project
        currentProject = getCurrentProject(); // Replace with the actual method to get the current project
    }

    private Project getCurrentProject() {
        // Logic to get the current project, replace this with your actual logic
        return new Project("Example Project"); // Replace with the actual constructor
    }
}
