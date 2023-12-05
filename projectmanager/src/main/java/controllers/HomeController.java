package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.*;

public class HomeController implements Initializable {
    @FXML private AnchorPane home_pane;
    
    @FXML
    private void onLoginCLicked(ActionEvent event) throws IOException {
        home_pane.getChildren().clear();
        home_pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/login.fxml")));
    }

    @FXML
    private void onSignupClicked(ActionEvent event) throws IOException {
        home_pane.getChildren().clear();
        home_pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/signup.fxml")));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
