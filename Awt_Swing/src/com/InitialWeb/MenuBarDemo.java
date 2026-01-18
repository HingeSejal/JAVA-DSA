package com.InitialWeb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBarDemo extends JFrame implements ActionListener{
	
	JMenuBar mbr;
	JMenu mStudent, mTeacher;
	JMenuItem miStudLogin , miChooseGender , miChooseBranch , miExit ;
	
	MenuBarDemo()
	{
		setLayout(null);
		
		mbr = new JMenuBar();
		mbr.setSize(500,30);
		mbr.setLocation(0,0);
		add(mbr);
		
		mStudent = new JMenu("Student");
		mbr.add(mStudent);
		
		mTeacher = new JMenu("Teacher");
		mbr.add(mTeacher);
		
		miStudLogin = new JMenuItem("Student Login");
		miStudLogin.addActionListener(this);
		mStudent.add(miStudLogin);
		
		miChooseGender = new JMenuItem("Student Gender");
		miChooseGender.addActionListener(this);
		mStudent.add(miChooseGender);
		
		miChooseBranch = new JMenuItem("Student Branch");
		miChooseBranch.addActionListener(this);
		mStudent.add(miChooseBranch);
		mStudent.addSeparator();
		
		miExit = new JMenuItem("Exit");
		miExit.addActionListener(this);
		mStudent.add(miExit);
		
		setTitle("Clg DataPage");
		setLocation(0,0);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s= (String) ae.getActionCommand();
		
		if(s.equals("Student Login"))
		{
			new LoginScreen();
//			JOptionPane.showMessageDialog(null, "Login SuccessFully !");
		}
		if(s.equals("Student Gender"))
		{
			 new RadioBtnDemo();
//			JOptionPane.showMessageDialog(null, "Gender is Chosen !");
		}
		if(s.equals("Student Branch"))
		{
			 new ScrollListDemo();
//			JOptionPane.showMessageDialog(null, "Branch is Chosen!");
		}
		if(s.equals("Exit"))
		{
			JOptionPane.showMessageDialog(null, "Ready to Exit, Bye Bye !");
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		
		new MenuBarDemo();

	}

}
