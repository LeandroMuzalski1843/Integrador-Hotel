module com.leandrom.hotel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.xml.crypto;


    opens com.leandrom.hotel to javafx.fxml;
    exports com.leandrom.hotel;

    opens com.leandrom.hotel.util to javafx.fxml;
    exports com.leandrom.hotel.util;

    opens com.leandrom.hotel.models to javafx.fxml;
    exports com.leandrom.hotel.models;


}