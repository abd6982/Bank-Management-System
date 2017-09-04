package com.baproject.core;

import java.sql.*;

public class CheckingAccount extends BankAccounts {
	int checks;
	
	 public CheckingAccount(int acno, String patronname, int age, String dob, String address, float balance){
		this.acno = acno;
		this.checks = 10;
		this.balance = balance;
		this.age = age;
		this.patronname = patronname;
		this.dob = dob;
		this.address = address;
		
		Connection con = null;
	    try{
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        con = DriverManager.getConnection("jdbc:mysql:///student?autoReconnect=true&useSSL=false", "root", "root");
	        if(!con.isClosed()){
	            System.out.println("Connected to MySQL");
	        
	            Statement stmt=con.createStatement();  
	            stmt.executeUpdate("create table if not exists acdetails(acno int(10), name varchar(10), age int(2), dob date, address varchar(20), balance float(10), checks int(3));");
	            stmt.executeUpdate("insert into acdetails (acno, name, age, dob, address, balance, checks) VALUES ('" + acno + "', '" + patronname + "', '" + age + "', '" + dob + "', '" + address + "', '" + balance + "', '" + checks + "');");    
	        }
	        con.close();
	    }catch(ClassNotFoundException c){
	        System.out.println("Class was not found");
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	
	public void buyChecks(int checks){
		this.checks = this.checks + checks;
	}
	
	public void writeCheck(int amount){
		super.withdraw(amount);
		checks--;
	}
	
	public int getChecks(){
		return checks;
	}
}
