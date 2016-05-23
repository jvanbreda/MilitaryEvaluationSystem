/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataflow.militaryevaluationsystem.PApplets;

import com.dataflow.militaryevaluationsystem.GraphType;
import com.dataflow.militaryevaluationsystem.graphs.Graph;
import com.dataflow.militaryevaluationsystem.data.DataProvider;
import com.dataflow.militaryevaluationsystem.graphs.BodyTempGraph;
import com.dataflow.militaryevaluationsystem.graphs.HeartRateGraph;
import processing.core.PApplet;

/**
 *
 * @author Jesse
 */
public class Canvas extends PApplet {
    
    private Graph graph;
    private DataProvider dataprovider;
    
    public Canvas(GraphType type){
        dataprovider = new DataProvider();
        switch(type){
            case HeartRate:
                graph = new HeartRateGraph(this, dataprovider.getDataList());
                break;
            case BodyTemp:
                graph = new BodyTempGraph(this, dataprovider.getDataList());
                break;
        }
    }
    
    @Override
    public void setup(){
        size(550,280);
    }
    
    @Override
    public void draw(){
        background(255);
        graph.drawAxis();
        graph.drawInvervals(10);
        graph.drawIntervalLabels(10);
        graph.drawData();
    }
}
