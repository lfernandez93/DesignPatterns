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
public class IcyRoadState implements RoadState {

    private Car car;

    public IcyRoadState(Car car) {
        this.car = car;
    }

    @Override
    public int accel() {
        car.setAccel(3);
        System.out.println("Car accel efficiency " + car.getAccel());
        return car.getAccel();
    }

    @Override
    public int left() {
        car.setLeft(1);
        System.out.println("Car left efficiency " + car.getLeft());
        return car.getLeft();
    }

    @Override
    public int right() {
        car.setRight(1);
        System.out.println("Car right efficiency " + car.getRight());
        return car.getRight();
    }

    @Override
    public int brakes() {
        car.setBrakes(2);
        System.out.println("Car right efficiency " + car.getBrakes());
        return car.getBrakes();
    }

}
