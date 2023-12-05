package controllers;

import java.util.UUID;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ProjectManagementSystem;
import model.User;
import projectmanager.App;


public class SignupController implements Initializable {
    @FXML private AnchorPane signup_pane;
    @FXML private TextField txt_username;
    @FXML private TextField txt_password;
    @FXML private TextField txt_first_name;
    @FXML private TextField txt_last_name;
    @FXML private TextField txt_email;
    @FXML private Label lbl_error;
    
    @FXML
    private void onSignupClicked(MouseEvent event) throws IOException {
        String username = txt_username.getText();
        String password = txt_password.getText();
        String firstName = txt_first_name.getText();
        String lastName = txt_last_name.getText();
        String email = txt_email.getText();
        
        //check for empty fields
        if(username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("") ||email.equals("")){
            lbl_error.setText("Sorry, You cannot leave blank fields");
            return;
        }
        
        
        ProjectManagementSystem pms = new ProjectManagementSystem();
        
        if(!pms.signUp(username, password, firstName, lastName, email)){
            lbl_error.setText("Sorry, this user couldn't be created.");
            return;
        }
        
        pms.login(username, password);
        // User user = pms.getCurrentUser();
        switchScreen();
    }
    
    
    private void switchScreen() throws IOException {
       App.setRoot("user_home");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
