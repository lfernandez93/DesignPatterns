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
public class RequestRepository {

    private List<Request> requests = new ArrayList();

    public void addRequest(Request request) {
        requests.add(request);
    }

    public List<Request> getRequests() {
        return requests;
    }

}
