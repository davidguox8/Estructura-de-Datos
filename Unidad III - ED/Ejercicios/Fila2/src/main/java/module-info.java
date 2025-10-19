module com.davidsystems.fila2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.fila2 to javafx.fxml;
    exports com.davidsystems.fila2;
    exports com.davidsystems.fila2.controller;
    opens com.davidsystems.fila2.controller to javafx.fxml;
}