/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.mediator;

/**
 *
 * @author Luis Fernandez
 */
public abstract class Ball {

    private int x;
    private int y;
    private String color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void putInTable(int x, int y);

    @Override
    public String toString() {
        return "Ball{" + "x=" + x + ", y=" + y + ", color=" + color + '}';
    }

}
