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
public class observerClient {

    public static void main(String[] args) {
        GuyWatching1 gu1 = new GuyWatching1();
        GuyWatching2 gu2 = new GuyWatching2();
        ConcreteStack cStack = new ConcreteStack(10);
        cStack.addObserver(gu2);
        cStack.addObserver(gu1);
        cStack.push(1);
    }
}
