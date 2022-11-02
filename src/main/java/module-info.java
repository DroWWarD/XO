module xo.xo {
    requires javafx.controls;
    requires javafx.fxml;


    opens xo.xo to javafx.fxml;
    exports xo.xo;
}