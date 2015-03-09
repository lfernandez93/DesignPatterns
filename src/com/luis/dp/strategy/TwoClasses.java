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
public class TwoClasses implements PriceStrategy {

    @Override
    public Double calculateRevenue(List<Passenger> passengers) {
        double normalPrice = passengers.get(0).getTicket().getPrice();
        double businessPrice = normalPrice * 1.5;
        int businessPeople = passengers.size() / 3;
        int normalPeople = passengers.size() - businessPeople;
        double revenue = ((businessPrice * businessPeople) - (Passenger.COST * 1.1)) + ((normalPrice * normalPeople) - Passenger.COST) ;
        return revenue;
    }

}
