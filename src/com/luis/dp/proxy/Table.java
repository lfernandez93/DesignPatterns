/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.proxy;

/**
 *
 * @author Luis
 */
public class Table implements ITable {

    private IRow[] table;
    private int rows;
    private int columns;

    public Table(int rows) {
        this.rows = rows;
        table = new Row[rows];
    }

    @Override
    public int numOfRows() {
        return rows;
    }

    @Override
    public IRow getRow(int rowNum) {
        return table[rowNum];
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        if (rowNum < rows) {
            table[rowNum] = row;
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        if (rowNum < rows) {
            table[rowNum] = row;
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        if (rowNum < rows) {
            for (int i = rowNum; i < table.length; i++) {
                table[i] = table[i++];
            }
            rows--;
        }
    }

}
