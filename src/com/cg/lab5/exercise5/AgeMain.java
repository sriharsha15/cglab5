package com.cg.lab5.exercise5;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = sc.nextInt();
		  Age obj=new Age();
		  obj.ageOfPerson(age);
		  sc.close();

	}

}
