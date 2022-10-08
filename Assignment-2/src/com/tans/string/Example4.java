package com.tans.string;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String s1=new String(s.nextLine());
		String s2=new String("Rebel");
		if(s1.equals(s2)) {
			System.out.println("Strings are match");
		}else {
			System.out.println("Strings sre not match");
		}

	}

}
