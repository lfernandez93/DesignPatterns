/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.strategy;

import java.util.List;

/**
 *
 * @author 984201
 */
public interface PriceStrategy {

    public Double calculateRevenue(List<Passenger> passengers);
}
