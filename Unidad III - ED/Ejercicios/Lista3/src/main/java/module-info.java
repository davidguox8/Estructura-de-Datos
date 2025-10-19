module com.davidsystems.lista3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.lista3 to javafx.fxml;
    exports com.davidsystems.lista3;
    exports com.davidsystems.lista3.controller;
    opens com.davidsystems.lista3.controller to javafx.fxml;
}