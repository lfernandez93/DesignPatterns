/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.flyweight;

import javax.swing.JButton;

/**
 *
 * @author Luis Fernandez
 */
public class MyButton extends JButton {

    private boolean mine;

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

}
