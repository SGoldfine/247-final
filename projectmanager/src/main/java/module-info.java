module projectmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens projectmanager to javafx.fxml;

    exports projectmanager;

    opens controllers to javafx.fxml;

    exports controllers;

    opens model to javafx.fxml;

    exports model;
}
