/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.visitor;

import javafx.geometry.Side;

/**
 *
 * @author Luis Fernandez
 */
public class Node extends Composite {

    public Node(String label, SideOptions side) {
        super(label, side);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public SideOptions getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Node{" + "side=" + side + ", label=" + label + '}';
    }

}
