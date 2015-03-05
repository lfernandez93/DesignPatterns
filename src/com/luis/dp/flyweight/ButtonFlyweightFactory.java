package com.luis.dp.flyweight;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonFlyweightFactory {

    private static java.util.Hashtable<String, MyButton> ht
            = new java.util.Hashtable<String, MyButton>();
    private static int count;
    private static int x;
    private static int y;

    public static MyButton makeButton(String num) {
        if (ht.get(num) != null) {
            System.out.println("HELLO!");
            MyButton mybt =ht.get(num);
            mybt.setLocation(x, y);
            x += 25;
            y += 25;
            return mybt;
        }

        MyButton btn = new MyButton();
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source instanceof Component) {
                    MyButton myBut = (MyButton) source;
                    if (!myBut.isMine()) {
                        myBut.setBackground(Color.GREEN);
                    } else {
                        myBut.setBackground(Color.RED);
                    }
                }
                System.out.println("You clicked the button");
            }
        });
        btn.setLocation(x, y);
        x += 25;
        y += 25;
        ht.put(num, btn);
        return btn;
    }

    public static void report() {
        System.out.println("Buttons created:");
        System.out.println("size = " + ht.size() + " ");
        for (java.util.Enumeration<String> e = ht.keys(); e.hasMoreElements();) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println("");
        System.out.println("-----------------------------------");
    }
}
