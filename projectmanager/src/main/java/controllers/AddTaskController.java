package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import projectmanager.App;

public class AddTaskController {

    @FXML
    private Button addTaskButton;

    @FXML
    private TextField taskNameTextField;

    @FXML
    private ComboBox<String> taskStatusComboBox;

    @FXML
    private Text headerText;

    @FXML
    private Pane mainPane;

    @FXML
    private void initialize() {
        // Initialize the ComboBox with task status options
        taskStatusComboBox.getItems().addAll("Abandoned", "To Do", "Doing", "Done");
        // Set default value for the ComboBox
        taskStatusComboBox.setValue("To Do");
    }

    @FXML
    private void onAddTaskClicked() throws IOException {
        String taskName = taskNameTextField.getText();
        String taskStatus = taskStatusComboBox.getValue();
        App.setRoot("project_page");

        // You can add more logic here, for example, adding the task to a list or database.
    }
}

