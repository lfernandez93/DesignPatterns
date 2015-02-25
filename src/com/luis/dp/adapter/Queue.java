/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.adapter;

/**
 *
 * @author Luis
 */
public interface Queue {

    public void enqueue(String enqueued);

    public String dequeue();
    
    public boolean isEmpty();
}
