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
public class StateController {

    public Car changeState(Car car, String state) {
        RoadState stateChanged = null;

        switch (state) {
            case "Regular":
                stateChanged = new RegularRoadState(car);
                break;
            case "Gravel":
                stateChanged = new GravelRoadState(car);
                break;
            case "Wet":
                stateChanged = new WetRoadState(car);
                break;
            case "Ice":
                stateChanged = new IcyRoadState(car);
                break;
        }

        car.setCurrentState(stateChanged);
        return car;
    }
}
