package com.emc.training.methodReferences;

class Customer{
	private int id;
	private String name;
	private double balance;
	
	public Customer() {
		super();
	}
	public Customer(int id) {
		super();
		this.id = id;
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}

interface A1{
	Customer createDefaultCustomer();
}

interface A2{
	Customer createCustomerWithId(int id);
}


interface A3{
	Customer createCustomerWithIdAndName(int id,String name);
}


interface A4{
	Customer createCustomerWithIdNameAndBalance(int id,String name, double balance);
}



public class CustomerRefTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a1=Customer::new;
		A2 a2=Customer::new;
		A3 a3=Customer::new;
		A4 a4=Customer::new;
		System.out.println(a1.createDefaultCustomer());
		System.out.println(a2.createCustomerWithId(1001));
		System.out.println(a3.createCustomerWithIdAndName(1001, "abhi"));
		System.out.println(a4.createCustomerWithIdNameAndBalance(1005, "abhi", 9000));
	}
}
