module com.example.gameui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gameui to javafx.fxml;
    exports com.example.gameui;
}