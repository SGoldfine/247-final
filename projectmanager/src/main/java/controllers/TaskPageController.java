package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    private Task currentTask; // Assuming Task is a class that represents a task

    // Initialize the controller
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the UI elements or load task data
        loadTaskData(); // Implement this method to load task data into the UI
    }

    // Method to load task data into UI elements
    private void loadTaskData() {
        // Fetch task details and populate UI elements
        // For instance:
        currentTask = fetchCurrentTask(); // Implement this method to fetch the task

        if (currentTask != null) {
            txtHoursWorked.setText(String.valueOf(currentTask.getHoursWorked()));
            txtTaskPriority.setText(currentTask.getPriority());
            txtTaskStatus.setText(currentTask.getStatus());
            displayComments(); // Implement this method to show existing comments
        }
    }

    // Method to display existing comments
    private void displayComments() {
        // Fetch comments associated with the task and display in the text area
        // For instance:
        if (currentTask != null) {
            txtAreaComments.setText(currentTask.getComments());
        }
    }

    // Method to handle adding a new comment
    @FXML
    private void onAddCommentClicked(MouseEvent event) {
        String newComment = txtNewComment.getText();
        
        // Add the new comment to the task
        if (currentTask != null && !newComment.isEmpty()) {
            currentTask.addComment(newComment); // Implement addComment method in Task class
            displayComments(); // Update the displayed comments
            txtNewComment.clear(); // Clear the input field after adding the comment
        } else {
            lblError.setText("Error: Unable to add an empty comment.");
        }
    }

    // Method to navigate back (if needed)
    @FXML
    private void back(MouseEvent event) throws IOException {
        // Implement navigation back to the previous page
        App.setRoot("previous_page");
    
