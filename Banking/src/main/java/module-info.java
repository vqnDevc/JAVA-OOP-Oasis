module com.jmc.banking {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.jmc.banking to javafx.fxml;
    exports com.jmc.banking;
    exports com.jmc.banking.Controller;
    exports com.jmc.banking.Controller.Admin;
    exports com.jmc.banking.Controller.Client;
    exports com.jmc.banking.Models;
    exports com.jmc.banking.Views;
}