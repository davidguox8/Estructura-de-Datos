module com.davidsystems.cola2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.cola2 to javafx.fxml;
    exports com.davidsystems.cola2;
    exports com.davidsystems.cola2.controller;
    opens com.davidsystems.cola2.controller to javafx.fxml;
}