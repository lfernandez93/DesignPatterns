/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.command;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.reflect.Reflection;

/**
 *
 * @author Luis Fernandez
 */
public class commandClient {

    public static void main(String[] args) {
        //String command="";
        CommandInterpreter command = new CommandInterpreter();
        command.interpret("create 5");
        command.interpret("move right 5");
        command.interpret("move right 5");
        command.interpret("undo");
        command.interpret("undo");
        
    }
}
