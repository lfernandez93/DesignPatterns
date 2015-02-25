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
public class TableProxy implements ITable {

    private ITable iTable;

    public TableProxy(int rows) {
        iTable = new Table(rows);
    }

    @Override
    public int numOfRows() {
        return iTable.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        return iTable.getRow(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized (this) {
            iTable.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized (this) {
            iTable.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized (this) {
            iTable.deleteRow(rowNum);
        }
    }

}
