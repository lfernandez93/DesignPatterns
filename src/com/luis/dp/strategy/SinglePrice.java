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
public class SinglePrice implements PriceStrategy{
    
    @Override
    public Double calculateRevenue(List<Passenger> passengers) {
        double pricePerUnit= passengers.get(0).getTicket().getPrice();
        return (pricePerUnit * passengers.size()) - 30;
    }

}
