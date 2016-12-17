package com.maratreason.Lesson7_01;

public class TestPayIncrease2 {

	public static void main(String[] args) {
		
		Person workers[] = new Person[5];
		workers[0] = new Employee("Mark", 100000);
		workers[1] = new Contractor("Mary", 120000);
		workers[2] = new Employee("Steve", 130000);
		workers[3] = new Contractor("Alex", 150000);
		workers[4] = new Employee("Marat", 140000);
		
		for(Person p: workers) {
			p.promote(30);
		}

	}

}
