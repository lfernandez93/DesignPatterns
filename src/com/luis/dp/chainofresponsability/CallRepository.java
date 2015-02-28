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
public class CallRepository {
    private List<Call> calls = new ArrayList();
    
    public void add(Call c){
        calls.add(c);
    }
    
    public List<Call> getCalls(){
        return calls;
    }
}
