module com.davidsystems.lista2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.lista2 to javafx.fxml;
    exports com.davidsystems.lista2;
    exports com.davidsystems.lista2.controller;
    opens com.davidsystems.lista2.controller to javafx.fxml;
}