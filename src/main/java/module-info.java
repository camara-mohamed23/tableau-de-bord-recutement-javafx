<<<<<<< HEAD
module com.example.projet5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.graphics;

    opens com.example.projet5 to javafx.fxml;
    exports com.example.projet5;
=======
module com.example.projet {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports com.example.projet1;
>>>>>>> 549285978d170ccaf74c74012197454d859fe9a1
}