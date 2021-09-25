package com.userinputexample;
import java.util.Scanner;

public class UserInputSubtraction {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the value of the first name");
		int a=scan.nextInt();
		 
		System.out.println("enyer the value of the second name");
		int b=scan.nextInt();
		 
		int c=a-b;
		System.out.println("sub ="+c);
		scan.close();
		
	}

}
