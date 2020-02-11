package com.cg.lab5.exercise2;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Fibonacci obj=new Fibonacci();
		System.out.println("Fibonacci Series using Normal Function:"+obj.fibonacciUsingNormalFunction(n));
		System.out.println("Fibonacci Series using Recursive method:"+obj.fib(n));
        scan.close();

	}

}
