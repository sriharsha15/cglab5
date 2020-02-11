package com.cg.lab5.exercise5;

public class Age {
	public void ageOfPerson(int age)
	{
		try {
			   if(age < 15) 
			   throw new AgeException("Invalid age");
			   else
			    System.out.println("Valid age");
			  }
			  catch (AgeException a) {
			  System.out.println(a);
			  }
	}

}
