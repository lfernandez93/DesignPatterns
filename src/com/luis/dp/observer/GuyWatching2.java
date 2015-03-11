/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.observer;

/**
 *
 * @author Luis Fernandez
 */
public class GuyWatching2 implements Observer {

    private Stack stack;

    @Override
    public void update(Observable obs) {
        stack = (Stack) obs;
        System.out.println("GuyWatching2 is aware stack as been changed");
        stack.display();
    }

}
