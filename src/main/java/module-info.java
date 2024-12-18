module com.r4ppz {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens org.r4ppz to javafx.fxml;
    opens org.r4ppz.controller to javafx.fxml;

    exports org.r4ppz;
    exports org.r4ppz.controller;
    exports org.r4ppz.util;
    exports org.r4ppz.model;
}