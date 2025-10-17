module com.leandrom.hotel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.leandrom.hotel to javafx.fxml;
    exports com.leandrom.hotel;

}