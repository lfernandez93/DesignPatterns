/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.state;

/**
 *
 * @author Luis Fernandez
 */
public interface RoadState {

    public int accel();

    public int left();

    public int right();

    public int brakes();
}
