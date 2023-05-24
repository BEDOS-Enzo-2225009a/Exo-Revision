module com.example.exorevision {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.exorevision to javafx.fxml;
    exports com.example.exorevision;
}