module com.example.scenebuilderproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilderproject to javafx.fxml;
    exports com.example.scenebuilderproject;
}