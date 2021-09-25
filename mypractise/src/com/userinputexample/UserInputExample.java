package com.userinputexample;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(1);
		char c = sc.next().charAt(2);
		char d = sc.next().charAt(4);
		char e = sc.next().charAt(5);
		char f = sc.next().charAt(6);
		System.out.println(a+""+b+""+c+""+d+""+e+""+f);
		sc.close();


	}

}
