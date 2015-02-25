/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 984201
 */
public class clientPrototype {
    Map<Integer,Employee> supervisors = new HashMap();
    
    public static void main(String[] args) {
        Employee winta = new Employee("winta");
        winta.setId(1);
        Employee sheriff = new Employee("sheriff");
        sheriff.setId(2);
        Employee mou = new Employee("mou");
        mou.setId(3);
        Employee donya = new Employee("donya");
        donya.setId(4);
        Employee luis = new Employee("luis");
        donya.setId(5);
        Employee marcela = new Employee("marcela");
        marcela.setId(6);
        Employee george = new Employee("george");
        george.setId(7);
        marcela.setSupervisor(winta);
        george.setSupervisor(winta);
        Employee[] staff = {marcela, george};
        winta.setStaff(staff);
        winta.setSupervisor(sheriff);
        sheriff.setSupervisor(mou);
        mou.setSupervisor(donya);
        donya.setSupervisor(luis);
        
        try {
            Employee wintaCopy = (Employee) winta.clone();
            //wintaCopy.setSupervisor(donya);
            //wintaCopy.getSupervisor().setFirstname("safwat");
            //wintaCopy.getStaff()[0].getSupervisor().setFirstname("asd");
            //wintaCopy.setStaff(null);
            System.out.println(winta);
            System.out.println(wintaCopy);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(clientPrototype.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
