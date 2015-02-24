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
public class AdaptQueue extends AdaptStack {

    private QueueOrStack queueOrStack=new QueueOrStack();;

    @Override
    public String pop() {
        int start = queueOrStack.getStart();
        String str = queueOrStack.get(start);
        queueOrStack.remove(start);
        queueOrStack.setStart(start++);
        return str;
    }

}
