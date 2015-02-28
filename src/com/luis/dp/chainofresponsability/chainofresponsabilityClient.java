/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.chainofresponsability;

import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class chainofresponsabilityClient {

    public static void main(String[] args) {
        CallRepository callRepo = new CallRepository();
        Call luis = new Call(1, true);
        Call donya = new Call(2, false);
        Call mou = new Call(3, true);
        Call sheriff = new Call(4, false);
        Call winta = new Call(5, true);
        callRepo.add(mou);
        callRepo.add(sheriff);
        callRepo.add(donya);
        callRepo.add(winta);
        callRepo.add(luis);
        Agent<List<Call>> agent = new ValidatorAgent();
        agent.handleRequest(callRepo.getCalls());
        
    }
}
