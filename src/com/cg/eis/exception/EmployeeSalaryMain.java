package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalaryMain {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	EmployeeSalary obj=new EmployeeSalary();
	obj.employeeSal(salary);
			
	}

}
