module com.davidsystems.cambiodeventanass {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;



    opens com.davidsystems.cambiodeventanass to javafx.fxml;
    exports com.davidsystems.cambiodeventanass;
    exports com.davidsystems.cambiodeventanass.controller;
    opens com.davidsystems.cambiodeventanass.controller to javafx.fxml;
}