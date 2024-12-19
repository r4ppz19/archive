module com.r4ppz {
    requires javafx.controls;
    requires javafx.fxml;
    //requires javafx.swing;
    requires transitive javafx.graphics;

    requires org.apache.pdfbox;
    requires transitive java.desktop;

    opens org.r4ppz to javafx.fxml;
    opens org.r4ppz.controller to javafx.fxml;

    // open all packages
    exports org.r4ppz;
    exports org.r4ppz.controller;
    exports org.r4ppz.util;
    exports org.r4ppz.model;

    // open test
    exports org.r4ppz.test;
}