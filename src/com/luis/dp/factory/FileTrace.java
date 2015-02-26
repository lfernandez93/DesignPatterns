/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.factory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Luis
 */
public class FileTrace implements Trace {

    private boolean debug;

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            File file = new File("debug.log");
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("debug.log", true)))) {
                out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
