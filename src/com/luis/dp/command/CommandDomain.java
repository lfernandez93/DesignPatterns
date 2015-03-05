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
public class CommandDomain {

    private String command;
    private int by;
    private String to;

    public CommandDomain(String command, int by, String to) {
        this.command = command;
        this.by = by;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getBy() {
        return by;
    }

    public void setBy(int by) {
        this.by = by;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "CommandDomain{" + "command=" + command + ", by=" + by + ", to=" + to + '}';
    }

}
