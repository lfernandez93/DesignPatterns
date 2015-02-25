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
public class AdaptStackQueue implements Stack,Queue {

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

    @Override
    public void enqueue(String enqueued) {
        queueOrStack.add(enqueued);
    }

    @Override
    public String dequeue() {
     int start = queueOrStack.getStart();
        String str = queueOrStack.get(start);
        queueOrStack.remove(start);
        queueOrStack.setEnd(start++);
        return str;   
        
    }

}
