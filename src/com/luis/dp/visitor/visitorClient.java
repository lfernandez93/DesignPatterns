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
public class visitorClient {

    public static void main(String[] args) {
        Composite root = new Node("Da root", SideOptions.NONE);
        Composite node = new Node("Da node of da root", SideOptions.LEFT);
        Component leafRoot = new Leaf("Da leaf of da root", SideOptions.RIGHT);
        Component leftChild = new Leaf("Da left child of da node", SideOptions.LEFT);
        Component rightChild = new Leaf("Da right child of da node", SideOptions.RIGHT);
        root.addChild(node);
        root.addChild(leafRoot);
        node.addChild(leftChild);
        node.addChild(rightChild);
       // Visitor v = new DisplayNodeVisitor();
        System.out.println(root);
        Iterator<Component> daIterator = root.getIterator();
        while(daIterator.hasNext()){
            daIterator.next();
        }
        
    }
}
