/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.command;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fernandez
 */
public class CommandInterpreter {

    //SquareDirector squareDirector = new SquareDirector();
    private Map<String, String> commands = new HashMap();
    private static final String PREFIX = "com.luis.dp.command.";
    Square sq = new Square();
    public CommandInterpreter() {
        commands.put("create", PREFIX + "CreateCommand");
        commands.put("scale", PREFIX + "ScaleCommand");
        commands.put("move", PREFIX + "MoveCommand");
        commands.put("undo", PREFIX + "UndoCommand");
    }

    public void interpret(String commandToInterpret) {
        String possibleCommand = "";
        int arg = 0;
        for (int i = 0; i < commandToInterpret.length(); i++) {
            char c = commandToInterpret.charAt(i);
            if (!Character.isDigit(c)) {
                possibleCommand += c;
            } else {
                arg = Integer.valueOf(commandToInterpret.charAt(i) + "");
                break;

            }
        }
        String splitCommand[] = possibleCommand.split(" ");
        CommandDomain commandDomain = null;

        if (splitCommand.length > 1) {
            commandDomain = new CommandDomain(splitCommand[0], arg, splitCommand[1]);
        } else {
            commandDomain = new CommandDomain(splitCommand[0], arg, null);
        }
        fireCommand(commandDomain);

    }

    private void fireCommand(CommandDomain command) {
        if (commands.get(command.getCommand()) != null) {

            String realCommand = commands.get(command.getCommand());
            try {
                Command commandToExecute = (Command) Class.forName(realCommand).getDeclaredConstructor(Square.class, CommandDomain.class).newInstance(sq, command);
                SquareDirector sqDirector = new SquareDirector();
                sqDirector.setCommand(commandToExecute);
                sqDirector.doAction();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(commandClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Invalid command.");
        }
    }
}
