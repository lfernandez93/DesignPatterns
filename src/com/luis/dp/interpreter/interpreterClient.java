/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.interpreter;

/**
 *
 * @author Luis Fernandez
 */
public class interpreterClient {

    public static void main(String[] args) {
        String tokenString = "- + 10 5 - 8 2";
        Interpreter interpreter = new Interpreter();
        interpreter.interpret(tokenString);
    }
}
