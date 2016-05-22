package com.dataflow.militaryevaluationsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MainWindowController implements Initializable {
    
    private Label label;
    @FXML
    private Pane heartbeat_area;
    @FXML
    private Pane bodytemp_area;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void startSession(ActionEvent event) {
    }

    @FXML
    private void endSession(ActionEvent event) {
    }

    @FXML
    private void export(ActionEvent event) {
    }
}
