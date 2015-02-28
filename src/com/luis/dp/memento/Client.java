
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

import java.sql.Date;

/**
 *
 * @author Luis Fernandez
 */
public class Client {

    private String firstName;
    private String lastName;
    private String dob;
    private int id;

    @Override
    public String toString() {
        return "Client{" + "firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", id=" + id + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
