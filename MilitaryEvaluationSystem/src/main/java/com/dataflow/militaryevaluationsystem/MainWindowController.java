package com.dataflow.militaryevaluationsystem;

import com.dataflow.militaryevaluationsystem.PApplets.Canvas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javax.swing.JPanel;
import processing.core.PApplet;

public class MainWindowController implements Initializable {
    
    private PApplet heartRateApplet;
    private PApplet bodyTempApplet;
    
    @FXML
    private Pane heartRatePane;
    @FXML
    private Pane bodyTempPane;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void startSession(ActionEvent event) {
        createHeartRateGraph();
        createBodyTempGraph();
    }

    @FXML
    private void endSession(ActionEvent event) {
    }

    @FXML
    private void export(ActionEvent event) {
    }
    
    private void createHeartRateGraph(){
        heartRateApplet = new Canvas(GraphType.HeartRate);        
        heartRateApplet.init();
        
        JPanel panel = new JPanel();
        panel.add(heartRateApplet);
        SwingNode s = new SwingNode();
        s.setContent(panel);
        heartRatePane.getChildren().add(s);
    }
    
    private void createBodyTempGraph(){
        bodyTempApplet = new Canvas(GraphType.BodyTemp);
        bodyTempApplet.init();
        
        JPanel panel = new JPanel();
        panel.add(bodyTempApplet);
        SwingNode s = new SwingNode();
        s.setContent(panel);
        bodyTempPane.getChildren().add(s);
    }
}
