package com.pooespol.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class VentanaInicioController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
