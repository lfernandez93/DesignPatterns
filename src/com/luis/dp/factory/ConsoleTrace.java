/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.factory;

/**
 *
 * @author Luis Fernandez
 */
public class ConsoleTrace implements Trace{
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if(debug){
            System.out.println(message);
        }
    }
    
}
