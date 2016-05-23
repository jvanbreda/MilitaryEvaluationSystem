/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataflow.militaryevaluationsystem.data;

import com.dataflow.militaryevaluationsystem.models.ShirtData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesse
 */
public class DataProvider {
    
    public List<ShirtData> getDataList(){
        List<ShirtData> data = new ArrayList<>();
        data.add(new ShirtData(22.7f, 400));
        data.add(new ShirtData(24f, 500));
        data.add(new ShirtData(27f, 350));
        data.add(new ShirtData(22.7f, 400));
        data.add(new ShirtData(22.7f, 400));
        data.add(new ShirtData(22.7f, 400));
        
        return data;
    }    
}
