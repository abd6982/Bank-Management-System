package com.baproject.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

@SuppressWarnings("serial")
public class BankAccountFrame extends JFrame{
	
	public BankAccountFrame(){

		setTitle("Bank Accounts");
		setSize(480, 320);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Select Operation", SwingConstants.CENTER);
		label.setBounds(160, 40, 140, 30);
		JButton c = new JButton("Create Account");
		c.setBounds(160, 100, 140, 30);
		JButton a = new JButton("Access Accounts");
		a.setBounds(160, 180, 140, 30);
		
		getContentPane().setBackground(Color.WHITE);
		
		add(label);
		add(c);
		add(a);
		
		c.setBackground(Color.DARK_GRAY);
		c.setForeground(Color.WHITE);
		c.setFocusable(false);
		
		a.setBackground(Color.DARK_GRAY);
		a.setForeground(Color.WHITE);
		a.setFocusable(false);
		
		setVisible(true);
		a.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				AccessAccountsFrame aaf = new AccessAccountsFrame();
				aaf.setVisible(true);			
			}
		});
		
		c.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
								
				CreateAccountFrame caf = new CreateAccountFrame();
				caf.setVisible(true);				
			}
		});
		
		addWindowListener(new WindowAdapter(){
			   @Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			   }
			});
	}
}
