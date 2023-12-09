package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

    // Sample list of users
    private List<String> userJsonList;

    @FXML
    private void initialize() {
        // Load the user list from the JSON file
        loadUserList();
    }

    private void loadUserList() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/data/user.json");

            if (inputStream != null) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                    // Read the JSON data into a List of Strings
                    userJsonList = reader.lines().collect(Collectors.toList());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception (e.g., show an alert to the user)
        }
    }

    @FXML
    private void onFindUserTextChanged() {
        // Handle the user search logic when the text in the search bar changes
        updateSearchResults();
    }

    private void updateSearchResults() {
        String searchTerm = findUserTextField.getText().toLowerCase();
        StringBuilder results = new StringBuilder();

        for (String jsonUser : userJsonList) {
            String username = extractUsername(jsonUser);

            // Filter usernames based on the search term
            if (username.toLowerCase().contains(searchTerm)) {
                results.append(username).append("\n");
            }
        }

        searchResultsTextArea.setText(results.toString());
    }

    private String extractUsername(String jsonUser) {
        // Extract the username from the JSON string (you may need to adjust this based on your actual JSON structure)
        int usernameIndex = jsonUser.indexOf("\"username\":\"") + 12;
        int endIndex = jsonUser.indexOf("\"", usernameIndex);
        return jsonUser.substring(usernameIndex, endIndex);
    }
}