package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import projectmanager.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AddUserController {

    @FXML
    private TextField findUserTextField;

    @FXML
    private TextArea searchResultsTextArea;

     @FXML 
    private void onReturnClicked(MouseEvent event) throws IOException {
        App.setRoot("project_manager");
    }

    @FXML 
    private void onLogoutClicked(MouseEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void initialize() {
        
    }
}