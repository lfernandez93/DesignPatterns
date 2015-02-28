/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.dp.chainofresponsability;

/**
 *
 * @author Luis Fernandez
 */
public interface Agent<T> {
       public void handleRequest(T request);
       public boolean canHandleRequest(T request);
}
