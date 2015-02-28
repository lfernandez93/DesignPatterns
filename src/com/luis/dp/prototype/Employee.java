/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.prototype;

import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fernandez
 */
public class Employee implements Cloneable, Serializable {

    private int id;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];
    private boolean doSupervisor=true;
    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        for (Employee staff1 : staff) {
            staff1.setSupervisor(this);
        }
        this.staff = staff;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee empClone = (Employee) super.clone();
        if(doSupervisor){
            empClone = recursiveCloneSupervisor(empClone);
        }
        return empClone;
    }

    public Employee recursiveCloneSupervisor(Employee empClone) throws CloneNotSupportedException {
 
        if (empClone.getSupervisor() != null) {
            Employee supervisorClone = (Employee) empClone.getSupervisor().clone();
            empClone.setSupervisor(supervisorClone);
            empClone = recursiveCloneStaff(empClone);
        }

        return empClone;
    }

    public Employee recursiveCloneStaff(Employee empClone) {
        //doSupervisor=false;
        if (empClone.getStaff() != null) {
            Employee[] staffCopies = new Employee[empClone.getStaff().length];
            for (int i = 0; i < staffCopies.length; i++) {

                try {
                    empClone.getStaff()[i].doSupervisor=false;
                    staffCopies[i] = (Employee) empClone.getStaff()[i].clone();
            
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            empClone.setStaff(staffCopies);
        }
        doSupervisor=true;
        return empClone;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", supervisor=" + supervisor + ",";
    }

}
