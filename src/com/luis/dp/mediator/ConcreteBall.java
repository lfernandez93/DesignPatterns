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
public class ConcreteBall extends Ball {

    private Mediator mediator;

    public ConcreteBall(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void putInTable(int x, int y) {
        mediator.putInTable(this, x, y);
    }

}
