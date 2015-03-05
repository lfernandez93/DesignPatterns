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
public class CreateCommand implements Command {

    private Square square;
    private CommandDomain commandDomain;

    public CreateCommand(Square square, CommandDomain commandDomain) {
        this.square = square;
        this.commandDomain = commandDomain;
    }

    @Override
    public void execute() {
        square.create(commandDomain.getBy());
    }

}
