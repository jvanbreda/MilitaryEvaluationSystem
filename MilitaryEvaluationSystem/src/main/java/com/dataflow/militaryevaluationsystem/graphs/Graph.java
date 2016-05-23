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
public abstract class Graph {
    
    protected Canvas applet;
    protected List<ShirtData> data;
    protected int margin;
    
    public Graph(Canvas applet, List<ShirtData> data){
        this.applet = applet;
        this.data = data;
        this.margin = 40;
    }
    
    public void drawAxis(){
        applet.line(margin, applet.height - margin, applet.width - margin, applet.height - margin);
        applet.line(margin, applet.height - margin, margin, margin);        
    }
    
    public int getMaxHeartBeat(){
        int maxHeartBeat = 0;
        for (ShirtData s : data){
            if (s.getHeartRate() > maxHeartBeat)
                maxHeartBeat = s.getHeartRate();
        }
        return maxHeartBeat;
    }
    
    public int getMinHeartBeat(){
        int minHeartBeat = Integer.MAX_VALUE;
        for (ShirtData s : data){
            if (s.getHeartRate() < minHeartBeat)
                minHeartBeat = s.getHeartRate();
        }
        return minHeartBeat;
    }
    
    public float getMaxBodyTemp(){
        float maxBodyTemp = 0f;
        for (ShirtData s : data){
            if (s.getBodyTemp() > maxBodyTemp)
                maxBodyTemp = s.getBodyTemp();
        }
        return maxBodyTemp;
    }
    
    public float getMinBodyTemp(){
        float minBodyTemp = Float.MAX_VALUE;
        for (ShirtData s : data){
            if (s.getHeartRate() < minBodyTemp)
                minBodyTemp = s.getHeartRate();
        }
        return minBodyTemp;
    }
    
    public List<ShirtData> mapData(){
        List<ShirtData> mappedData = new ArrayList<>();
        for(ShirtData s : data){
            ShirtData newData = new ShirtData();
            int newHeartBeat = (int) map((float)s.getHeartRate(), (float) getMinBodyTemp() - 10, (float) getMaxHeartBeat(), applet.height - margin, margin);
            float newBodyTemp = map(s.getBodyTemp(), getMinBodyTemp() - 10, getMaxBodyTemp(), applet.height - margin, margin);
            newData.setHeartRate(newHeartBeat);
            newData.setBodyTemp(newBodyTemp);
            mappedData.add(newData);
        }
        return mappedData;
    }
    
    public void drawInvervals(int intervals){
        int lineheight = 10;
        int graphHeight = applet.height - 2 * margin;
        int graphWidth = applet.width - 2 * margin;
        applet.textAlign(applet.RIGHT, applet.CENTER);
        for (int i = 0; i <= intervals; i++) {
            applet.line(margin, applet.height - margin - (i * (graphHeight / intervals)), margin - 4, applet.height - margin - (i * (graphHeight / intervals)));
        }
        
    }
    public abstract void drawData();
    public abstract void drawIntervalLabels(int intervals);
    
}
