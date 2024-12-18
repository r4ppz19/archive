module com.r4ppz {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.r4ppz to javafx.fxml;
    opens com.r4ppz.controller to javafx.fxml;

    exports com.r4ppz;
    exports com.r4ppz.controller;
    exports com.r4ppz.util;
    exports com.r4ppz.model;
}