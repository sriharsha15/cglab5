package com.cg.lab5.exercise4;

public class Employee {
	void nameException(String firstName,String lastName)
	{
		try
		{
			if(firstName.length()==0 || lastName.length()==0) 
			{
				
			throw new EmployeeException ("firstName and lastName is blank");
			}
			else 
			{
				System.out.println("good");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
	
}
