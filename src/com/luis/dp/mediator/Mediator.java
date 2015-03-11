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
public interface Mediator {

    public void putInTable(Ball ball, int x, int y);

    public void addABall(Ball ball);

    public void checkDiagonal(Ball ball);

    public void checkHorizontal(Ball ball);

    public void checkVertical(Ball ball);

    public void display();
}
