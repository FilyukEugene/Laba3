module com.example.laba3barabash {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba3barabash to javafx.fxml;
    exports com.example.laba3barabash;
}