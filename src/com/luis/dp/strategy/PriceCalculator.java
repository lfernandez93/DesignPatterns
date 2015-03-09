/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.strategy;

import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class PriceCalculator {

    private PriceStrategy priceStrategy;

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public void revenue(List<Passenger> passengers) {
        System.out.println("Total revenue " + priceStrategy.calculateRevenue(passengers));
    }
}
