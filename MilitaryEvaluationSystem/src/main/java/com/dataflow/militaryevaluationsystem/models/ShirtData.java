/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataflow.militaryevaluationsystem.models;

/**
 *
 * @author Jesse
 */
public class ShirtData {
    
    private float bodyTemp;
    private int heartRate;

    public ShirtData(){
        
    }
    
    public ShirtData(float bodyTemp, int heartRate) {
        this.bodyTemp = bodyTemp;
        this.heartRate = heartRate;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    
    
}
