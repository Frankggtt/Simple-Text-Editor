module com.example.edytortekstu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.edytortekstu to javafx.fxml;
    exports com.example.edytortekstu;
}