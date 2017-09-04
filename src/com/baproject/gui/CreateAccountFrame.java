package com.baproject.gui;

import com.baproject.core.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class CreateAccountFrame extends JFrame{
	
	public CreateAccountFrame(){
		
		setTitle("Create Account");
		setSize(512, 480);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Create Account");
		label.setBounds(180, 20, 160, 30);
		
		JLabel l1 = new JLabel("Name : ");
		l1.setBounds(20, 60, 120, 25);
		JTextField t1 = new JTextField();
		t1.setBounds(200, 60, 120, 25);
		JLabel l2 = new JLabel("Age : ");
		l2.setBounds(20, 100, 120, 25);
		JTextField t2 = new JTextField();
		t2.setBounds(200, 100, 120, 25);
		JLabel l3 = new JLabel("DOB : ");
		l3.setBounds(20, 140, 120, 25);
		JTextField t3 = new JTextField();
		t3.setBounds(200, 140, 120, 25);
		JLabel l4 = new JLabel("Address : ");
		l4.setBounds(20, 180, 120, 25);
		JTextField t4 = new JTextField();
		t4.setBounds(200, 180, 120, 25);
		JLabel l5 = new JLabel("Balance : ");
		l5.setBounds(20, 220, 120, 25);
		JTextField t5 = new JTextField();
		t5.setBounds(200, 220, 120, 25);
		JButton check = new JButton("Checking");
		check.setBounds(60, 320, 120, 30);
		JButton save = new JButton("Savings");
		save.setBounds(300, 320, 120, 30);
		
		JLabel l6 = new JLabel("A/C No. : ");
		l6.setBounds(20, 260, 120, 25);
		JTextField t6 = new JTextField();
		t6.setBounds(200, 260, 120, 25);
		
		getContentPane().setBackground(Color.WHITE);
		
		add(label);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(check);
		add(save);
		
		check.setBackground(Color.DARK_GRAY);
		check.setForeground(Color.WHITE);
		check.setFocusable(false);
		
		save.setBackground(Color.DARK_GRAY);
		save.setForeground(Color.WHITE);
		save.setFocusable(false);
		
		check.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				final int acno = Integer.parseInt(t6.getText());
				final String patronname = t1.getText();
				final int age = Integer.parseInt(t2.getText());
				final String dob = t3.getText();
				final String address = t4.getText();
				final float balance = Integer.parseInt(t5.getText());
				
				Main.accounts[Main.i] = new CheckingAccount(acno, patronname, age, dob, address, balance);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				Main.i++;
				JOptionPane.showMessageDialog(null, "Account Successfully Created");
				
			}
		});
		
		save.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				final int acno = Integer.parseInt(t6.getText());
				final String patronname = t1.getText();
				final int age = Integer.parseInt(t2.getText());
				final String dob = t3.getText();
				final String address = t4.getText();
				final float balance = Integer.parseInt(t5.getText());
				
				Main.accounts[Main.i] = new SavingsAccount(acno, patronname, age, dob, address, balance);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				Main.i++;
				JOptionPane.showMessageDialog(null, "Account Successfully Created");
				
			}
		});
	}

}
