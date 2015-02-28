/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.iterator;

/**
 *
 * @author Luis Fernandez
 */
public interface Iterator<T> {

    public boolean hasNext();

    public T next();
}
