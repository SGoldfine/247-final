import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

public class AddUserController {

    @FXML
    private Text addUserText;

    @FXML
    private TextField findUserTextField;

    @FXML
    private ComboBox<String> assignRoleComboBox;

    @FXML
    private TextArea searchResultsTextArea;

    @FXML
    private Slider slider;

    // Sample list of users
    private JSONArray userJSONArray;

    @FXML
    private void initialize() {
        // Initialize the ComboBox with sample role options
        assignRoleComboBox.getItems().addAll("Developer", "Administrator", "User");

        // Load the user list from the JSON file
        loadUserList();
    }

    private void loadUserList() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/path/to/user.json");

            if (inputStream != null) {
                String jsonString = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

                // Parse the JSON array manually
                userJSONArray = new JSONArray(jsonString);
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

        for (int i = 0; i < userJSONArray.length(); i++) {
            JSONObject jsonUser = userJSONArray.getJSONObject(i);
            String username = jsonUser.getString("username");

            // Filter usernames based on the search term
            if (username.toLowerCase().contains(searchTerm)) {
                results.append(username).append("\n");
            }
        }

        searchResultsTextArea.setText(results.toString());
    }
}
