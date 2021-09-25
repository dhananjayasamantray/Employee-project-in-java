package com.classexample11;

import java.util.Scanner;

public class IntModulus {
	Scanner scan = new Scanner (System.in);
	int firstnumber = 200;
	int secondnumber = 16;
	public void add() {
		System.out.println("enter the value of first name");
		int a= scan.nextInt();
		System.out.println("enter the value of second name");
		int b= scan.nextInt();
		int c=a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		IntModulus xyz = new IntModulus();
		xyz.add();
		
		

	}

}
