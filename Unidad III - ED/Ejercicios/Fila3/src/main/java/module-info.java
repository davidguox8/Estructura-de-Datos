module com.davidsystems.fila3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.fila3 to javafx.fxml;
    exports com.davidsystems.fila3;
    exports com.davidsystems.fila3.controller;
    opens com.davidsystems.fila3.controller to javafx.fxml;
}