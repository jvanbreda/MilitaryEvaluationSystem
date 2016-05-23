/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataflow.militaryevaluationsystem.graphs;

import com.dataflow.militaryevaluationsystem.PApplets.Canvas;
import com.dataflow.militaryevaluationsystem.models.ShirtData;
import java.util.List;

/**
 *
 * @author Jesse
 */
public class BodyTempGraph extends Graph {
    
    private final int margin = 10;
    private final Canvas canvas = super.applet;
    private final List<ShirtData> data = super.data;

    public BodyTempGraph(Canvas applet, List<ShirtData> data) {
        super(applet, data);
    }

    @Override
    public void drawData() {
        
    }

    @Override
    public void drawIntervalLabels(int intervals) {
        
    }
    
}
