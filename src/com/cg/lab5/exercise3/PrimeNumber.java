package com.cg.lab5.exercise3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Number :");
	       int n=scan.nextInt();
	       Prime obj=new Prime();  
	       obj.printPrimeNumbers(n);
	       scan.close();

	}

}
