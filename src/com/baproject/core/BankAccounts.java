package com.baproject.core;

public class BankAccounts {

	protected int acno;
	protected String patronname;
	protected int accountnumber;
	protected int age;
	protected String address;
	protected float balance;
	protected String dob;

	public void deposit(int amount){
		this.balance = this.balance + amount;
	}
	
	public void withdraw(int amount){
		this.balance = this.balance - amount;
	}
	
	public String getName(){
		return this.patronname;
	}
	
	public void setName(String name){
		this.patronname = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getDob(){
		return this.dob;
	}
	
	public void setSex(String dob){
		this.dob = dob;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getAC(){
		return this.accountnumber;
	}
	
	public float getBalance(){
		return this.balance;
	}
}
