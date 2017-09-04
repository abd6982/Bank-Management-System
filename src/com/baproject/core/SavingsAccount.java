package com.baproject.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SavingsAccount extends BankAccounts {
	
	public SavingsAccount(int acno, String patronname, int age, String dob, String address, float balance){
		this.balance = balance;
		this.age = age;
		this.patronname = patronname;
		this.dob = dob;
		this.address = address;
		this.acno = acno;
		
		Connection con = null;
	    try{
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        con = DriverManager.getConnection("jdbc:mysql:///student?autoReconnect=true&useSSL=false", "root", "root");
	        if(!con.isClosed()){
	            System.out.println("Connected to MySQL");
	        
	            Statement stmt=con.createStatement();  
	            stmt.executeUpdate("create table if not exists acdetails(acno int(10), name varchar(10), age int(2), dob date, address varchar(20), balance float(10), checks int(3));");
	            stmt.executeUpdate("insert into acdetails (acno, name, age, dob, address, balance) VALUES ('" + acno + "', '" + patronname + "', '" + age + "', '" + dob + "', '" + address + "', '" + balance + "');");    
	        }
	        con.close();
	    }catch(ClassNotFoundException c){
	        System.out.println("Class was not found");
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	
	public void addInterest(int r_interest){
		this.balance = this.balance + (this.balance / 100) * r_interest;
	}
}
