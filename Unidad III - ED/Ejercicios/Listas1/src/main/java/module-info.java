module com.davidsystems.listas1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.listas1 to javafx.fxml;
    exports com.davidsystems.listas1;
    exports com.davidsystems.listas1.controller;
    opens com.davidsystems.listas1.controller to javafx.fxml;
}