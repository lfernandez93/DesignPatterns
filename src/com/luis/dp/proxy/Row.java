/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.proxy;

import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Row implements IRow {

    private int columns;
    private String row[];

    public Row(String[] values) {
        this.columns = values.length;
        row = values;
    }

    @Override
    public IRow getRow() {
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(row);
    }

}
