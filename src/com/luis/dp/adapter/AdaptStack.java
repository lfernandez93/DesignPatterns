/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.adapter;

/**
 *
 * @author 984201
 */
public class AdaptStack implements DataStructure, AdaptInter {

    private QueueOrStack queueOrStack=new QueueOrStack();

    @Override
    public void push(String str) {
        queueOrStack.add(str);
    }

    @Override
    public String pop() {
        int end = queueOrStack.getEnd();
        String str = queueOrStack.get(end);
        queueOrStack.remove(end);
        queueOrStack.setEnd(end--);
        return str;

    }

    @Override
    public boolean isEmpty() {
        return queueOrStack.empty();
    }

}
