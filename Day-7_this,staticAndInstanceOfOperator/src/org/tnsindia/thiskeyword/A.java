package org.tnsindia.thiskeyword;

class A {
	public String name;
	public int id;
	public void accept(String name,int id)
	{
		//this keyword is used here to refer current class var
		this.name=name;
		this.id=id;
	}
	//user-defined-method
	public void print()
	{
		System.out.println("The name is: "+name);
		System.out.println("The ID is: "+id);
	}
}
public class DemoOnThisKeywordInstanceVar {

	public static void main(String[] args) {
		A a=new A();
		a.accept("Shiwani", 121);
		a.print();
		

	}

}