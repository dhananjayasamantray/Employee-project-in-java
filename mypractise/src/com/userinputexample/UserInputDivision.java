package com.userinputexample;

import java.util.Scanner;

public class UserInputDivision {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter the first value of the number");
		int a= scan.nextInt();
		
		System.out.println("Enter the second value of the number");
		int b= scan.nextInt();
		
		int c=-a/b;
		System.out.println("div="+c);
		scan.close();

	}

}
