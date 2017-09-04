package com.baproject.gui;

import com.baproject.core.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class AccessAccountsFrame extends JFrame{
	
	private int i = -1;
	boolean type;
	
	public AccessAccountsFrame(){
		
		setTitle("Account Information");
		setSize(640, 480);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Account Information");
		label.setBounds(240, 20, 160, 30);
		
		JLabel l1 = new JLabel("Name : ");
		l1.setBounds(60, 80, 120, 30);
		JLabel t1 = new JLabel();
		t1.setBounds(240, 80, 120, 30);
		JLabel l2 = new JLabel("Age : ");
		l2.setBounds(60, 110, 120, 30);
		JLabel t2 = new JLabel();
		t2.setBounds(240, 110, 120, 30);
		JLabel l3 = new JLabel("DOB : ");
		l3.setBounds(60, 140, 120, 30);
		JLabel t3 = new JLabel();
		t3.setBounds(240, 140, 120, 30);
		JLabel l4 = new JLabel("Address : ");
		l4.setBounds(60, 170, 120, 30);
		JLabel t4 = new JLabel();
		t4.setBounds(240, 170, 120, 30);
		JLabel l5 = new JLabel("A/C Number : ");
		l5.setBounds(60, 200, 120, 30);
		JLabel t5 = new JLabel();
		t5.setBounds(240, 200, 120, 30);
		JLabel l6 = new JLabel("Balance : ");
		l6.setBounds(60, 230, 120, 30);
		JLabel t6 = new JLabel();
		t6.setBounds(240, 230, 120, 30);
		JLabel l7 = new JLabel("");
		l7.setBounds(400, 80, 120, 30);
		JLabel l8 = new JLabel("No. of Checks : ");
		l8.setBounds(400, 110, 120, 30);
		JButton b1 = new JButton("Start");
		b1.setBounds(460, 320, 80, 30);
		JButton b2 = new JButton("Add Interest");
		b2.setBounds(180, 320, 120, 30);
		JButton b3 = new JButton("Write Check");
		b3.setBounds(180, 320, 120, 30);
		JButton b4 = new JButton("Withdraw");
		b4.setBounds(180, 280, 120, 30);
		JButton b5 = new JButton("Add Checks");
		b5.setBounds(180, 340, 120, 30);
		JButton b6 = new JButton("Deposit");
		b6.setBounds(460, 280, 120, 30);
		JTextField f1 = new JTextField();
		f1.setBounds(40, 280, 100, 30);
		JTextField f2 = new JTextField();
		f2.setBounds(40, 320, 100, 30);
		JTextField f3 = new JTextField();
		f3.setBounds(40, 340, 100, 30);
		JTextField f4 = new JTextField();
		f4.setBounds(340, 280, 100, 30);
		
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
		add(l7);
		add(l8);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		b1.setFocusable(false);
		b1.setVisible(true);
		
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.WHITE);
		b2.setFocusable(false);
		b2.setVisible(false);
		
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.WHITE);
		b3.setFocusable(false);
		b3.setVisible(false);
		
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.WHITE);
		b4.setFocusable(false);
		b4.setVisible(false);
		
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.WHITE);
		b5.setFocusable(false);
		b5.setVisible(false);
		
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.WHITE);
		b6.setFocusable(false);
		b6.setVisible(false);
		
		f1.setVisible(false);
		f2.setVisible(false);
		f3.setVisible(false);
		f4.setVisible(false);
		l8.setVisible(false);
		
		b1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(Main.i != 0 && i < Main.i - 1){
					b1.setText("Next");

					if(CheckingAccount.class.isInstance(Main.accounts[i + 1])){
						b3.setVisible(true);
						b4.setVisible(true);
						b5.setVisible(true);
						f1.setVisible(true);
						f2.setVisible(true);
						f3.setVisible(true);
						f4.setVisible(true);
						b2.setVisible(false);
						b6.setVisible(true);
						l8.setVisible(true);
						l8.setText("No. of Checks : " + Integer.toString(((CheckingAccount) Main.accounts[i + 1]).getChecks()));
						l7.setText("Checking Account");
						l7.setVisible(true);
					}
					
					if(SavingsAccount.class.isInstance(Main.accounts[i + 1])){
						b3.setVisible(false);
						b4.setVisible(true);
						b5.setVisible(false);
						b2.setVisible(true);
						b6.setVisible(true);
						f1.setVisible(true);
						f2.setVisible(true);
						f3.setVisible(false);
						f4.setVisible(true);
						l8.setVisible(true);
						l7.setText("Savings Account");
						l7.setVisible(true);
					}
					
						if(i < Main.i + 1){
							i++;
							t1.setText(Main.accounts[i].getName());
							t2.setText(Integer.toString(Main.accounts[i].getAge()));
							t3.setText(String.valueOf(Main.accounts[i].getDob()));
							t4.setText(Main.accounts[i].getAddress());
							t5.setText(String.valueOf(Main.accounts[i].getAC()));
							t6.setText(String.valueOf(Main.accounts[i].getBalance()));
						}
				}	
				else{
					JOptionPane.showMessageDialog(null, "End of Records");
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				((SavingsAccount) Main.accounts[i]).addInterest(Integer.parseInt(f2.getText()));
				t6.setText(String.valueOf(Main.accounts[i].getBalance()));
				f2.setText("");
			}
		});
		
		b3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				((CheckingAccount) Main.accounts[i]).writeCheck(Integer.parseInt(f2.getText()));
				t6.setText(String.valueOf(Main.accounts[i].getBalance()));
				l8.setText("No. of Checks : " + Integer.toString(((CheckingAccount) Main.accounts[i]).getChecks()));
				f2.setText("");
			}
		});
		
		b4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Main.accounts[i].withdraw(Integer.parseInt(f1.getText()));
				t6.setText(String.valueOf(Main.accounts[i].getBalance()));
				f1.setText("");
			}
		});
		
		b5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				((CheckingAccount) Main.accounts[i]).buyChecks(Integer.parseInt(f3.getText()));
				f3.setText("");
				l8.setText("No. of Checks : " + Integer.toString(((CheckingAccount) Main.accounts[i]).getChecks()));
			}
		});	
		
		b6.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Main.accounts[i].deposit(Integer.parseInt(f4.getText()));
				t6.setText(String.valueOf(Main.accounts[i].getBalance()));
				f4.setText("");
			}
		});
	}
}
