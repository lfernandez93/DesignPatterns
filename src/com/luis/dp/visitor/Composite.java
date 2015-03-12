/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984201
 */
public abstract class Composite implements Component {

    public List<Component> components = new ArrayList();
    protected SideOptions side;
    protected String label;

    public Composite(String label, SideOptions side) {
        this.label = label;
        this.side = side;
    }

    public void addChild(Component c) {
        components.add(c);
    }

    public void removeChild(Component c) {
        components.remove(c);
    }

    public List<Component> getChildren() {
        return components;
    }

    public Iterator<Component> getIterator() {
        return new TreeIterator(components);
    }
}
