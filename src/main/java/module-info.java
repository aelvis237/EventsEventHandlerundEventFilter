module com.example.eventseventhandlerundeventfilter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventseventhandlerundeventfilter to javafx.fxml;
    exports com.example.eventseventhandlerundeventfilter;
}