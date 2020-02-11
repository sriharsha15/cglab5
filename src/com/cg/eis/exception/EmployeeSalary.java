package com.cg.eis.exception;

public class EmployeeSalary {
	public void employeeSal(int salary)
	{
		try {
		if(salary<=3000){
			throw new SalaryException ("Salary should be above 3000");
			}
		else
		{
			System.out.println("Salary of Employee is :" + salary);
		}
		}
		catch(SalaryException e) {
			System.out.println("Exception Occurred :" + e);
			
		}
		
	}
}

