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
public class DisplayNodeVisitor implements Visitor {

    @Override
    public void visit(Leaf leaf) {
        System.out.println(leaf);
    }

    @Override
    public void visit(Node node) {
        System.out.println(node);
    }

}
