package com.userinputexample;

import java.util.Scanner;

public class UserInputAddition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter the value of first name");
		int a= scan.nextInt();
		
		System.out.println("enter the value of second name");
		int b= scan.nextInt();
		
		int c=a+b;
		System.out.println("sum="+c);
		scan.close();
	}

}
