package com.cg.lab5.exercise2;

public class Fibonacci {
	public int fibonacciUsingNormalFunction(int n)
	{
	  int NthDigit=0,first=1,second=1,temp=0;
	  for(int index=0;index<n-2;index++)
	  {
		  temp=first+second;
		  first=second;
		  second=temp;
	  }
	   NthDigit=temp;
	  return NthDigit;
	}
	
	public int fib(int n)
   {
		 if (n <= 1) 
		        return n; 
		    return fib(n-1) + fib(n-2); 
   }

}
