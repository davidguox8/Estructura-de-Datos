module com.davidsystems.colo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.colo3 to javafx.fxml;
    exports com.davidsystems.colo3;
    exports com.davidsystems.colo3.controller;
    opens com.davidsystems.colo3.controller to javafx.fxml;
}