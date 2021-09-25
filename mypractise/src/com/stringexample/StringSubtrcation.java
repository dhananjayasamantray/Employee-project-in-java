package com.stringexample;

import java.util.Scanner;

public class StringSubtrcation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter firstname");
		String firstName = scan.nextLine();
		
		System.out.println("enter lastname");
		String lastName = scan.nextLine();
		
		String  fullName =  firstName + lastName;
		String  fullName1 = firstName + "" +lastName;
		System.out.println(fullName);
		System.out.println(fullName);
		scan.close();
	}

}
