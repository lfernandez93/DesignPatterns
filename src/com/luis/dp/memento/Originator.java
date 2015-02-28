/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

/**
 *
 * @author Luis Fernandez
 */
public class Originator<T> {

    T state;

    public void set(T state) {
        this.state = state;
    }

    public Memento<T> saveToMemento() {
        return new Memento<T>(state);
    }

    public T restoreFromMemento(Memento m) {
        return (T) m.getSavedState();
    }
}
