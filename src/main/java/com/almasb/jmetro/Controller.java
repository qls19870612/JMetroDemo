package com.almasb.jmetro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class Controller {

    @FXML
    private Label labelJRE;

    public void initialize() {
        labelJRE.setText(System.getProperty("java.version"));
    }
}
