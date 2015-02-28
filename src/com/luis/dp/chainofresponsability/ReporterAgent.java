/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.chainofresponsability;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class ReporterAgent implements Agent<List<Call>> {

    @Override
    public void handleRequest(List<Call> request) {
        System.out.println("posible clients at " + new Date());
        for (Call call : request) {
            System.out.println(call.getId() + " " + call.isProbablyAClient());
        }
        System.out.println("total posible clients --- " + request.size());
    }

    @Override
    public boolean canHandleRequest(List<Call> request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
