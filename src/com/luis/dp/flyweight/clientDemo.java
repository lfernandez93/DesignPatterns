package com.luis.dp.flyweight;

import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class clientDemo {

	public static final int NUM = 25;
	public static final int RAN = 10;
	/** 
	 * main program running on the server side
	 * creating GUI for input commands
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Client Demo");
	    frame.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent we) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	      });
		frame.setLayout(new GridLayout(NUM, NUM));
		
		for(int i = 0; i < NUM; i++)
			for(int j = 0; j < NUM; j++)
			{
				int label = (int)(Math.random() * RAN);
				//System.out.println(label);
				frame.add(ButtonFlyweightFactory.makeButton(
							Integer.toString(label)));
			}
		frame.setSize(600, 600);
		frame.setVisible(true);
		ButtonFlyweightFactory.report();
	}

}