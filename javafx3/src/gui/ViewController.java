package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

    @FXML
    private Button btTest;

    public void onBtTestAction(){
        Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
    }
}