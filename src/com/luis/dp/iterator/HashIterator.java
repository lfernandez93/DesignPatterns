/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.iterator;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Luis
 */
public class HashIterator implements Iterator<User>{
    private Map<String,User> mapUser;
    int index;
    private Set<String> keys;
    private java.util.Iterator<String> itKeys;
    public HashIterator(Map<String,User> mapUser) {
            this.mapUser = mapUser;
            keys = mapUser.keySet();
            itKeys = keys.iterator();
    }
    
    
    @Override
    public boolean hasNext() {
        return index<mapUser.size();
    }

    @Override
    public User next() {
        User user = null;
        if(index<mapUser.size()){
            user = mapUser.get(itKeys.next());
            index++;
        }else{
            throw new IndexOutOfBoundsException();
        }
        return user;
    }
    
}
