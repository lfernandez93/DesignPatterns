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
public class ValidatorAgent implements Agent<List<Call>> {

    List<Call> validatedRequests = new ArrayList();
    private Agent nextAgent = new DataWasherAgent();
    @Override
    public void handleRequest(List<Call> request) {
        if(!this.canHandleRequest(request)){
            nextAgent.handleRequest(validatedRequests);
        }else{
            return;
        }
    }

    @Override
    public boolean canHandleRequest(List<Call> request) {
        for (Call call : request) {
            if (call.getId() != 0) {
                validatedRequests.add(call);
            }
        }
        return false;
    }

}
