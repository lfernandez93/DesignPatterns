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
public class mediatorClient {
    public static void main(String[] args) {
        Mediator mediator = new BoardMediator();
        Ball ball = new ConcreteBall(mediator);
        Ball ball2 = new ConcreteBall(mediator);
        ball.setColor("white");
        ball2.setColor("black");
        mediator.addABall(ball);
        mediator.addABall(ball2);
        ball.putInTable(0, 0);
        ball2.putInTable(1, 0);
        mediator.display();
    }
}
