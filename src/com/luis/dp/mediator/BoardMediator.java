/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class BoardMediator implements Mediator {

    private List<Ball> balls = new ArrayList<>();
    private Ball[][] board = new Ball[5][5];

    @Override
    public void putInTable(Ball ball, int x, int y) {
        board[x][y]=ball;
        
    }

    @Override
    public void addABall(Ball ball) {
        balls.add(ball);
    }

    @Override
    public void checkDiagonal(Ball ball) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkHorizontal(Ball ball) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkVertical(Ball ball) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println(board.length);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
