/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.visitor;

import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class TreeIterator implements Iterator<Component> {

    private List<Component> children;
    private int index;
    private Visitor v = new DisplayNodeVisitor();
    public TreeIterator(List<Component> children) {
        this.children = children;

    }

    @Override
    public boolean hasNext() {
        return index < children.size();
    }

    @Override
    public Component next() {
        Component c = children.get(index++);
        c.accept(v);
        if (c instanceof Composite) {
            Composite node = (Composite) c;
            Iterator<Component> it = node.getIterator();
            while(it.hasNext()){
                 it.next();
            }
        }
        return c;
    }

}
