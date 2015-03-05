/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.command;

/**
 *
 * @author Luis Fernandez
 */
public class SquareDirector {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doAction() {
        command.execute();
    }
}
