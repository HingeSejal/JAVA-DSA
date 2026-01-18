package com.InitialWeb;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class ComboBoxDemo extends JFrame implements ItemListener
{
	JComboBox cbx;
	JTextField tf;
	
	
	ComboBoxDemo()
	{
		setLayout(null); //aaplya ichhe nusar layout/location of components set karaychiye
		
		String sub[]= {"C","CPP","Core Java","Adv Java","Hibernate","Spring","Spring Boot","Python"};
		cbx = new JComboBox(sub);
		cbx.setSize(200,30);
		cbx.setLocation(100,50);
		cbx.addItemListener(this);
		add(cbx);
		
		tf= new JTextField();
		tf.setSize(200,20);
		tf.setLocation(100,100);
		add(tf);
		
		
		setTitle("Subject Demo");
		setSize(500,200);
		setLocation(500,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		String s= (String) cbx.getSelectedItem(); //typecast
		tf.setText(s);
	}
	
	public static void main(String[] args) {
		ComboBoxDemo cbxd = new ComboBoxDemo();
	}

}
