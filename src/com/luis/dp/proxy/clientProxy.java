/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.proxy;

/**
 *
 * @author Luis Fernandez
 */
public class clientProxy {

    public static void main(String[] args) {
        final ITable iTable = new TableProxy(4);
        final IRow iRow = new Row(new String[]{"a", "b", "c"});
        final IRow iRow1 = new Row(new String[]{"d", "e", "f"});
        final IRow iRow2 = new Row(new String[]{"g", "h", "i"});
        final IRow iRow3 = new Row(new String[]{"j", "k", "l"});

        iTable.addRow(iRow, 0);
        iTable.addRow(iRow1, 1);
        iTable.addRow(iRow2, 2);
        iTable.addRow(iRow3, 3);

        for (int i = 0; i < iTable.numOfRows(); i++) {
            System.out.println(iTable.getRow(i));
        }

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                iTable.addRow(iRow, 0);
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                iTable.addRow(iRow1, 0);
            }
        });
        

    }
}
