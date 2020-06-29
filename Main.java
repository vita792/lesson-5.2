package com.company;

import java.util.Scanner;


public class Main  {

    public static void main(String[] args) {

	System.out.println("Calculate: ");
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	char action = scan.next().charAt(0);
	double b = scan.nextDouble();
	Zminni var = new Zminni();
	var.a = a;
	var.b = b;


	switch (action){
		case '+':
			Dodavannja addition = new Dodavannja();
			addition.action(a, b);
			System.out.println(addition.action(a, b));
       		break;
		case '-':
			Vidnimannja subtraction = new Vidnimannja();
			subtraction.action(a, b);
			System.out.println(subtraction.action(a, b));
			break;
		case '*':
			Mnogennja multiplication = new Mnogennja();
			multiplication.action(a, b);
			System.out.println(multiplication.action(a, b));
			break;
		case '/':
			Dilennja division = new Dilennja();
			division.action(a, b);
			System.out.println(division.action(a, b));
			break;
	};

    }
}
