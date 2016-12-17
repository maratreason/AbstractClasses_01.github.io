package com.maratreason.Lesson7_01;

public class Employee extends Person {

	public Employee(String name, int salary) {
		super(name, salary);
	}
	
	public boolean increasePay(int percent) {
		System.out.println("Increasing salary by " + percent + "%. " + getName());
		System.out.println("Salary " + getName() + " was " + getSalary() + ". And now his salary is "
				+ (getSalary() + (getSalary() * INCREASE_CAP / 100)) );
		return true;
	}
	
}
