package org.tnsindia.inheritance;

import java.util.Scanner;

//Example of Single Inheritance
//parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The animal is:"+name);
	}
}
//child class
class Dog extends Animal
{
	public String breed;
	public void print()
	{
		System.out.println("The the dog breed is:"+breed);
	}
}

