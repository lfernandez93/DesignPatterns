/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class TextContent implements Content {

    private List<Request> requests = new ArrayList();

    public TextContent(List<Request> requests) {
        this.requests = requests;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    @Override
    public String print() {
        String body = "";

        for (Request request : requests) {
            body +=request.getReqId() + " " + request.getReqContent() + " " + request.getAgent().getName() + " " + request.getRequester().getName() + " " + request.isIsAnswered()+"\n";
        }
        return body;
    }

  

}
