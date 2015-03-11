/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public abstract class Observable {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);

    }

    public void deleteObserver(Observer obs) {
        observers.remove(obs);
    }

    public abstract void notifyObservers();
}
