module pl.edu.pw{
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.edu.pw to javafx.fxml;
    exports pl.edu.pw;
}
