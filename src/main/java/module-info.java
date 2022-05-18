module com.example.tabslidein {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabslidein to javafx.fxml;
    exports com.example.tabslidein;
}