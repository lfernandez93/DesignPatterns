/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class strategyClient {

    public static void main(String[] args) {
        Passenger pa = null;
        Ticket t = new Ticket();
        t.setId(1);
        t.setPrice(300);
        List<Passenger> passengers = new ArrayList();
        for (int i = 0; i < 100; i++) {
            pa = new Passenger("", "");
            pa.setTicket(t);
            passengers.add(pa);
        }

        PriceCalculator pCalculator = new PriceCalculator();
        pCalculator.setPriceStrategy(new TwoClasses());
        pCalculator.revenue(passengers);
    }
}
