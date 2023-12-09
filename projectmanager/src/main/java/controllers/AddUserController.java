package controllers;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import projectmanager.App;

public class AddUserController {
    
    @FXML 
    private void onReturnClicked(MouseEvent event) throws IOException {
        App.setRoot("project_manager");
    }

    @FXML 
    private void onLogoutClicked(MouseEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }

}
