/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class CareTaker<T> {
    private List<Memento<T>> savedStates = new ArrayList<Memento<T>>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento<T> getMemento(int index) {
        return savedStates.get(index);
    }
    public Memento<T> removeMemento(int index){
        Memento m =savedStates.get(index);
        savedStates.remove(index);
        return m;
    }
    public int size(){
        return savedStates.size();
    }
}
