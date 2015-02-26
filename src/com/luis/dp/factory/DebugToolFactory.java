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
public class DebugToolFactory implements DebugFactory {

    @Override
    public Trace createDebugTool(String type) {
        Trace debugTrace = null;
        if (type.equals("trace.log")) {
            debugTrace = new FileTrace();
        } else {
            if (type.equals("console")) {
                debugTrace = new ConsoleTrace();
            }
        }
        return debugTrace;
    }

}
