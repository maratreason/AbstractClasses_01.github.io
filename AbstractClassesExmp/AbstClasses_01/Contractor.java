package com.maratreason.Lesson7_01;

public class Contractor extends Person {

	public Contractor(String name, int salary){
		super(name, salary);
	}
	
	public boolean increasePay(int percent){
		if(percent < INCREASE_CAP) {
			System.out.println("Increasing salary by " + percent + "%. " + getName());
			System.out.println("Salary " + getName() + " was " + getSalary() + ". And now his salary is "
			+ (getSalary() + (getSalary() * INCREASE_CAP / 100)) );
			return true;
		} else {
			System.out.println("Sorry, can't increase hourly rate by more than " + INCREASE_CAP + "%. " + getName());
			return false;
		}
	}
	
}
