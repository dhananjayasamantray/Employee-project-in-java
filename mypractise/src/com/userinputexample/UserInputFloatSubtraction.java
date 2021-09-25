package com.userinputexample;

import java.util.Scanner;

public class UserInputFloatSubtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first value");
		float a=scan.nextFloat();
		System.out.println("enter the second value");
		float b=scan.nextFloat();
		float c=a-b;
		System.out.println("subtrction result is="+c);
		scan.close();
		

	}

}
