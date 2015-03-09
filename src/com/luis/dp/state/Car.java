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
public class Car {

    private String model;
    private int accel;
    private int left;
    private int right;
    private int brakes;
    private RoadState currentState;

    public RoadState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(RoadState currentState) {
        this.currentState = currentState;
    }

    public int getAccel() {
        return accel;
    }

    public void setAccel(int accel) {
        this.accel = accel;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBrakes() {
        return brakes;
    }

    public void setBrakes(int brakes) {
        this.brakes = brakes;
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
