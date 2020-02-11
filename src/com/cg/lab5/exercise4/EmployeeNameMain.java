package com.cg.lab5.exercise4;

import java.util.Scanner;

public class EmployeeNameMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		Employee emp=new Employee();
		emp.nameException(firstName, lastName);
		sc.close();
		

	}

}
