module com.jmc.banking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.banking to javafx.fxml;
    exports com.jmc.banking;
}