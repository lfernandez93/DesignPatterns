/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.factory;

/**
 *
 * @author Luis
 */
public class clientFactory {
    public static void main(String[] args) {
        DebugFactory db = new DebugToolFactory();
        Trace debugTool = db.createDebugTool(args[0]);
        debugTool.setDebug(true);
        debugTool.debug("hello");
    }
}
