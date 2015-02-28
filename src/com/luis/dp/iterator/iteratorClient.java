/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.iterator;

/**
 *
 * @author 984201
 */
public class iteratorClient {

    public static void main(String[] args) {
        UserRepository userRepo = new UserRepository();
        User luis = new User();
        luis.setFirstName(new FirstName("Luis"));
        luis.setLastName(new LastName("Fernandez"));
        User marcela = new User();
        marcela.setFirstName(new FirstName("Diana"));
        marcela.setLastName(new LastName("Sanchez"));
        User safwat = new User();
        safwat.setFirstName(new FirstName("Ahmed"));
        safwat.setLastName(new LastName("Badawy"));
        userRepo.add(luis);
        userRepo.add(marcela);
        userRepo.add(safwat);
        
        Iterator<User> it = userRepo.getIterator();
        while(it.hasNext()){
            System.out.println(it.next().getFirstName().getFirstName());
        }
    
    }
}
