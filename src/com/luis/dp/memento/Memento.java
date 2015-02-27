/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

/**
 *
 * @author Luis
 */
public class Memento<T> {
    private T objectToSave;

    public Memento(T object) {
        this.objectToSave=object;
    }
    
    public T getSavedState(){
        return objectToSave;
    }
    
}
