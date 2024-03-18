module es.etg.prog.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.etg.prog.jfx to javafx.fxml;
    exports es.etg.prog.jfx;
}
