package com.userinputexample;

import java.util.Scanner;

public class UserInputMultiplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of the first number");
		int a=scan.nextInt();
		
		System.out.println("Enter value of the second number");
		int b=scan.nextInt();
		
		int c=a*b;
		System.out.println("multiplication="+c);
		scan.close();

	}

}
