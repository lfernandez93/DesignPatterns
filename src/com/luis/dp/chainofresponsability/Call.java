/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.chainofresponsability;

/**
 *
 * @author Luis Fernandez
 */
public class Call {

    private int id;
    private boolean probablyAClient;
    private State state = State.NONE;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isProbablyAClient() {
        return probablyAClient;
    }

    public void setProbablyAClient(boolean probablyAClient) {
        this.probablyAClient = probablyAClient;
    }

}
