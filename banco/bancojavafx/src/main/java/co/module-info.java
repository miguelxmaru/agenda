module uniquindio.edu.co {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.controller to javafx.fxml;
    exports co.edu.uniquindio.poo.controller;
}
