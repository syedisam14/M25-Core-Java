package org.tnsindia.abstractkeyword;

public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("Rajan","Male",1021);
		Person p1=new Employee("Ranvijay","Male",0);
		System.out.println(p.toString());

		p.work();
		p1.work();
		p.changeName("Issamuddin");
		System.out.println(p.toString());
		
		

		

	}

}