package com.InitialWeb;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginScreen extends JFrame implements ActionListener
{
	JLabel l1, l2;
	JTextField tf1;
	JPasswordField tf2;
	JButton b1,b2;
	
	LoginScreen ()
	{
		setLayout(null);
		
		l1 = new JLabel("UserName : ");
		l1.setSize(100,20);
		l1.setLocation(50,30);
		add(l1);
		
		l2 = new JLabel("Password : ");
		l2.setSize(100,20);
		l2.setLocation(50,60);
		add(l2);
		
		tf1 = new JTextField();
		tf1.setSize(200,20);
		tf1.setLocation(150,30);
		add(tf1);
		
		tf2 = new JPasswordField();
		tf2.setSize(200,20);
		tf2.setLocation(150,60);
		add(tf2);
		
		b1 = new JButton("Login");
		b1.setSize(100,30);
		b1.setLocation(90,100);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Logout");
		b2.setSize(100,30);
		b2.setLocation(250,100);
		b2.addActionListener(this);
		add(b2);
		
		setTitle("Developed by Sejal Hinge");
		setSize(450,300);
		setLocation(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String)ae.getActionCommand();
		
		if(s.equals("Login"))
		{
//			tf1.setText("SEJALHINGE");
//			tf2.setText("SEjal@1234");
			
			String u = tf1.getText();
			String p = tf2.getText();
			
			if(u.equals("Sejal") && p.equals("Sejal@123"))
			{
				JOptionPane.showMessageDialog(null, "Login Successfull !");
				System.exit(0);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Login Failed !");
				tf1.setText("");
				tf2.setText("");
				tf1.requestFocus();
			}
		}
		
		if(s.equals("Logout"))
		{
//			tf1.setText("");
//			tf2.setText("");
			
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		
		LoginScreen ob = new LoginScreen();

	}

}
