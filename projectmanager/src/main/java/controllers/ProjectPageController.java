package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
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
<<<<<<< HEAD
    private void onAddTaskClicked(MouseEvent event) throws IOException{
        // Task newTask = createNewTask(); // Replace with the actual method to create a new task
        // //currentProject.addTask(newTask); // Assuming the Project class has an addTask method
        // tasksListView.getItems().add(newTask);
=======
    private void onAddTaskClicked() throws IOException {
>>>>>>> 9a016ce1bcf12595035987fd4cee1ff84f31e6b3
        App.setRoot("add_task");
    }

    @FXML 
    private void onAddUserClicked(MouseEvent event) throws IOException {
        App.setRoot("add_user");
    }

    @FXML 
    private void onTaskClicked(MouseEvent event) throws IOException {
        App.setRoot("task_page");
    }
    
    @FXML 
    private void onReturnClicked(MouseEvent event) throws IOException {
        App.setRoot("project_manager");
    }

    @FXML 
    private void onLogoutClicked(MouseEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }

    // private Task createNewTask() {
    //     // Logic to create a new task, replace this with your actual task creation logic
    //     return new Task("New Task"); // Replace with the actual constructor
    // }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // // Initialize the controller, like setting the current project
        // currentProject = getCurrentProject(); // Replace with the actual method to get the current project
    }

    // private Project getCurrentProject() {
    //     // Logic to get the current project, replace this with your actual logic
    //     return new Project("Example Project"); // Replace with the actual constructor
    // }
}
