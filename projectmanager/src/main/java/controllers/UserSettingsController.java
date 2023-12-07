package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

public class UserSettingsController implements Initializable {

    @FXML
    private CheckBox scrumMasterCheckbox;
    @FXML
    private CheckBox developerCheckbox;
    @FXML
    private CheckBox userCheckbox;

    @FXML
    private void onSelectRole() {
        // Logic to handle role selection
        // Example: Update user role based on checkbox states
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize anything necessary for the controller
    }
}
