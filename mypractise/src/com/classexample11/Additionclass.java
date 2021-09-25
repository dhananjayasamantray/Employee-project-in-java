package com.classexample11;

public class Additionclass {
	int firstname = 10;
	int secondname = 20;
	 
	public void add() {
		int sum = firstname+secondname;
		System.out.println("adition=" +sum);
	}

	public static void main(String[] args) {
		//creation of object;
		Additionclass dj = new Additionclass();
		dj.add();
		}

}
