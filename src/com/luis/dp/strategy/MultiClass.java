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
public class MultiClass implements PriceStrategy {

    @Override
    public Double calculateRevenue(List<Passenger> passengers) {
        double normalPrice = passengers.get(0).getTicket().getPrice();
        double restPrice = normalPrice * 0.75;
        double firstClassPrice = normalPrice * 4;
        double businessPrice = normalPrice * 1.5;
        int firstClassPeople = passengers.size() / 10;
        int businessPeople = passengers.size() / 5;
        int restPeople = passengers.size() - firstClassPeople - businessPeople;
        double revenue = ((firstClassPrice * firstClassPeople) + (businessPrice * businessPeople) - (Passenger.COST * 1.2)) + ((restPrice * restPeople) - Passenger.COST);
        return revenue;

    }

}
