/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.iterator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Fernandez
 */
public class UserRepository implements Container{
    private Map<String,User> userMap = new HashMap();
    
    public void add(User user){
        userMap.put(user.getFirstName().getFirstName(), user);
        userMap.put(user.getLastName().getLastName(), user);
    }
    @Override
    public Iterator getIterator() {
        return new HashIterator(userMap);
    }
    
}
