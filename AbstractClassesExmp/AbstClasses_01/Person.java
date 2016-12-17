package com.maratreason.Lesson7_01;

public abstract class Person {
	
	private String name;
	private int salary;
	
	final int INCREASE_CAP = 40;
	
	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return "Person's name is " + name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void changeAddress(String address) {
		System.out.println("Person's address is " + address);
	}
	
	private void giveDayOff() {
		System.out.println("Giving a day off to " + name);
	}
	
	public void promote(int percent) {
		System.out.println("Promoting a worker...");
		giveDayOff();
		
		increasePay(percent);
	}
	
	public abstract boolean increasePay(int percent);

}
