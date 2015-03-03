/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.dp.builder;

/**
 *
 * @author Luis Fernandez
 */
public class builderClient {
    public static void main(String[] args) {
        //We have the data of the call so we are going to populate 
        //now the request object
        Person personInCall = new Person();
        personInCall.setFirstName("Winta");
        personInCall.setLastName("Assefa");
        Person agentInCall = new Person();
        agentInCall.setFirstName("Sheriff");
        agentInCall.setLastName("LastName Sheriff");
        
        RequestPopulator reqPopulator = new RequestPopulator(new RequestBuilder());
        reqPopulator.addAgentAndRequest("1", agentInCall);
        reqPopulator.addUserInfo(personInCall);
        reqPopulator.addContent("My cell phone is not working");
        reqPopulator.addAnswer("You should buy another one");
        reqPopulator.addMiscellaneous(true, false);
        Request r = reqPopulator.construct();
        System.out.println(r);
    }
}
