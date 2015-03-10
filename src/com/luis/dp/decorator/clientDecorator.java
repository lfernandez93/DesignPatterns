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
public class clientDecorator {
    public static void main(String[] args) {
        Stack stack = new ConcreteStack(10);
        Decorator deco = new StackDebugger(stack);
        
        deco.push(1);
        deco.push(2);
        deco.push(3);
        deco.pop();
    }
}
