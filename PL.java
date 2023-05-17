/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poe.kmltodb;

/**
 *
 * @author Desperate
 */
public class PL {
    private String name;
    private String coord;
    
    PL () {};
    
    PL (String name, String coord) {
        this.name = name;
        this.coord = coord;  
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCoord(String coord) {
        this.coord = coord;
    }
    
    public String getCoord() {
        return coord;
    }
}
