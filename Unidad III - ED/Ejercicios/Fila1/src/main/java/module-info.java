module com.davidsystems.fila1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.davidsystems.fila1 to javafx.fxml;
    exports com.davidsystems.fila1;
    exports com.davidsystems.fila1.Controller;
    opens com.davidsystems.fila1.Controller to javafx.fxml;
}