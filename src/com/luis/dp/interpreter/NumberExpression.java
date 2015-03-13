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
public class NumberExpression implements Expression {

    private int n;

    public NumberExpression(int n) {
        this.n = n;
    }

    @Override
    public String interpret() {
        //System.out.println(n+" ");
        return n + "";
    }

}
