/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.decorator;

/**
 *
 * @author Luis Fernandez
 */
public class ConcreteStack implements Stack {

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
    }

    @Override
    public int pop() {
        return object[tail--];
    }

    @Override
    public void display() {
        for (int i = 0; i < tail; i++) {
            System.out.print(object[i] + " ");
        }
        System.out.println();
    }

}
