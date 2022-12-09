module co.edu.cue.finalprojectbarber {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens co.edu.cue.finalprojectbarber to javafx.fxml;
    exports co.edu.cue.finalprojectbarber;
    opens co.edu.cue.finalprojectbarber.FXML to javafx.fxml;
    opens co.edu.cue.finalprojectbarber.controller to javafx.fxml;
    exports co.edu.cue.finalprojectbarber.controller;
    opens co.edu.cue.finalprojectbarber.model to javafx.fxml;
    exports co.edu.cue.finalprojectbarber.model;


    opens co.edu.cue.finalprojectbarber.Utilities to javafx.fxml;


}