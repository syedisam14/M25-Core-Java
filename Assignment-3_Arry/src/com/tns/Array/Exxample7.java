package com.tns.Array;


class Student1{
	public int roll_no;
	public String name;
	Student1(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
		
	}
	
}

public class Exxample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 []arr;
		arr=new Student1[5];
		arr[0]=new Student1(1,"isam");
		arr[1]=new Student1(2,"asad");
		arr[2]=new Student1(3,"shahid");
		arr[3]=new Student1(4,"ahmed");
		arr[4]=new Student1(5,"salauddin");
		for(Student1 i:arr) {
			System.out.println("Student roll_no:"+i.roll_no+" \t  Name: "+i.name);
		}


	}

}
