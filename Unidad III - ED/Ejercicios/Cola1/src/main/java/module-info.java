module com.davidsystems.cola1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.cola1 to javafx.fxml;
    exports com.davidsystems.cola1;
    exports com.davidsystems.cola1.controller;
    opens com.davidsystems.cola1.controller to javafx.fxml;
}