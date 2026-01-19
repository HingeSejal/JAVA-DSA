package com.InitialWeb;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemo extends JFrame implements ActionListener
{
	JCheckBox ch1 , ch2, ch3;
	JLabel l;
	JTextField tf;
	JButton b1;
	
	CheckBoxDemo()
	{
		setLayout(null); //aaplya ichhe nusar layout/location of components set karaychiye
		
		l = new JLabel("Select Your Hobby: ");
		l.setLocation(50,20);
		l.setSize(150,20);
		add(l);
		
		ch1 = new JCheckBox("Dance");
		ch1.setSize(100,30);
		ch1.setLocation(100,50);
		ch1.addActionListener(this);
		add(ch1);
		
		ch2 = new JCheckBox("Bloging");
		ch2.setSize(100,30);
		ch2.setLocation(200,50);
		ch2.addActionListener(this);
		add(ch2);
		
		ch3 = new JCheckBox("Acting");
		ch3.setSize(100,30);
		ch3.setLocation(300,50);
		ch3.addActionListener(this);
		add(ch3);
				
		tf= new JTextField();
		tf.setSize(200,20);
		tf.setLocation(140,130);
		add(tf);
		
		b1 = new JButton("OK");
		b1.setSize(100,30);
		b1.setLocation(200,80);
		b1.addActionListener(this);
		add(b1);
		
		setTitle("Choose Your Hobby");
		setSize(500,200);
		setLocation(500,250);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s =  ae.getActionCommand();
		
		if(s.equals("OK"))
		{
            String msg="";
            
            if(ch1.isSelected())
            {
            	msg = msg + ch1.getText() + " ";
            }
            if(ch2.isSelected())
            {
            	msg = msg + ch2.getText() + " ";
            }
            if(ch3.isSelected())
            {
            	msg = msg + ch3.getText() + " ";
            }
            tf.setText(msg);
            
			
		}
	}
	
	public static void main(String[] args) {
		CheckBoxDemo rdbtn = new CheckBoxDemo();
	}

}
