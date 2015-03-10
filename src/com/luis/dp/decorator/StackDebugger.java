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
public class StackDebugger extends Decorator {

    private Stack stack;

    public StackDebugger(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void debug() {
        stack.display();
    }

    @Override
    public void push(int element) {
        System.out.println("before invocation push method");
        debug();
        stack.push(element);
        System.out.println("after invocation push method");
        debug();

    }

    @Override
    public int pop() {
        System.out.println("before invocation pop method");
        debug();
        int element = stack.pop();
        System.out.println("after invocation pop method");
        debug();
        return element;
    }

    @Override
    public void display() {
        stack.display();
    }

}
