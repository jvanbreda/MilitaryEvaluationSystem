/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataflow.militaryevaluationsystem.graphs;

import com.dataflow.militaryevaluationsystem.PApplets.Canvas;
import com.dataflow.militaryevaluationsystem.models.ShirtData;
import java.util.ArrayList;
import java.util.List;
import static processing.core.PApplet.map;

/**
 *
 * @author Jesse
 */
public class HeartRateGraph extends Graph {

    public HeartRateGraph(Canvas applet, List<ShirtData> data) {
        super(applet, data);
    }

    @Override
    public void drawData() {
        List<ShirtData> mappedData = mapData();
        int counter = 1;
        for(ShirtData s : mappedData){
            applet.ellipse(margin + counter * margin, s.getHeartRate(), 3, 3);
            counter++;
        }
        
    }

    @Override
    public void drawIntervalLabels(int intervals) {
        int graphHeight = applet.height - 2 * margin;
        applet.textAlign(applet.RIGHT, applet.CENTER);
        applet.fill(0);
        for (int i = 0;  i <= intervals; i++){
            int intervalLabel = ((super.getMaxHeartBeat() - super.getMinHeartBeat()) / intervals) * i + super.getMinHeartBeat();
            applet.text(Integer.toString(intervalLabel), margin - 10, applet.height - margin - (i * (graphHeight / intervals)));
            
        }
        
    }
}
