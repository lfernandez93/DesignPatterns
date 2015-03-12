/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.visitor;

/**
 *
 * @author Luis Fernandez
 */
public class Leaf implements Component {

    private SideOptions side;
    private String label;

    public Leaf(String label, SideOptions side) {
        this.label = label;
        this.side = side;
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
        return "Leaf{" + "side=" + side + ", label=" + label + '}';
    }

}
