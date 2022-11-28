module com.example.snakedraft {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakedraft to javafx.fxml;
    exports com.example.snakedraft;
}