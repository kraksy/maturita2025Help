module com.example.podnik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.podnik to javafx.fxml;
    exports com.example.podnik;
}