package com.company;

import java.util.Scanner;


public class Main  {

    public static void main(String[] args) {

	System.out.println("Calculate: ");
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	String action = scan.next();
	double b = scan.nextDouble();




	switch (action){
		case "+":
			Dodavannja addition = new Dodavannja();
			System.out.println(addition.result();
		break;
		case "-":
			Vidnimannja subtraction = new Vidnimannja();
			System.out.println(subtraction);
			break;
		case "*":
			Mnogennja multiplication = new Mnogennja();
			System.out.println(multiplication);
			break;
		case "/":
			Dilennja division = new Dilennja();
			System.out.println(division);
			break;
	};

    }
}
