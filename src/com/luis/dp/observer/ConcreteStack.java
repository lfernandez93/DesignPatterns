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
public class ConcreteStack extends Observable implements Stack {

    int object[];
    private int tail;

    public ConcreteStack(int size) {
        object = new int[size];
    }

    @Override
    public void push(int element) {
        if (tail < object.length) {
            object[tail] = element;
            tail++;
        }
        notifyObservers();
    }

    @Override
    public int pop() {
        int popup = object[tail--];
        notifyObservers();
        return popup;
    }

    @Override
    public void display() {
        for (int i = 0; i < tail; i++) {
            System.out.print(object[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
