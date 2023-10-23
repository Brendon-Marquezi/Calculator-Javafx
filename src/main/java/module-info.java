module com.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.calculator to javafx.fxml;
    exports com.calculator;
    exports com.calculator.View;
    exports com.calculator.Controller;
    opens com.calculator.Controller to javafx.fxml;
}