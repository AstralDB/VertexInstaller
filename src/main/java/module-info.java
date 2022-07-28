module com.example.vertexinstaller {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens me.orly.vertexinstaller to javafx.fxml;
    exports me.orly.vertexinstaller;
}