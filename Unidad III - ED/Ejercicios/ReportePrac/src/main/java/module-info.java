module com.davidsystems.reporteprac {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.reporteprac to javafx.fxml;
    exports com.davidsystems.reporteprac;
    exports com.davidsystems.reporteprac.controller;
    opens com.davidsystems.reporteprac.controller to javafx.fxml;
}