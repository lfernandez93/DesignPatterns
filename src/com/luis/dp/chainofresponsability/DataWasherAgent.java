/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class DataWasherAgent implements Agent<List<Call>> {

    private List<Call> posibleClients = new ArrayList();
    private Agent nextAgent = new ReporterAgent();

    @Override
    public void handleRequest(List<Call> request) {
       if(!canHandleRequest(request)){
           nextAgent.handleRequest(posibleClients);
       }else{
           return;
       }
    }

    @Override
    public boolean canHandleRequest(List<Call> request) {
        for (Call call : request) {
            if (call.isProbablyAClient()) {
                posibleClients.add(call);
            }
        }
        return false;
    }

}
