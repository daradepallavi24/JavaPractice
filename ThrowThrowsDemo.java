package com.string;

import java.io.IOException;

public class ThrowThrowsDemo {

	/*static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid");
		
		/*ArithmeticException ae=new ArithmeticException(); // object
		ArithmeticException es; // refrence
		new ArithmeticException();  //instance
		
		else
			System.out.println("ur are eligible");
	}*/
	void method1() throws IOException // ur are throwing exception class in method signature 
	{
		throw new IOException("problem");  //ur thrwing the instance of the class
	}
	
	void method2() throws IOException
	{
		method1();
	}
	void method3()
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			System.out.println("exception handled hua");
		}
	}
	public static void main(String[] args) {
			
		/*
		 * validate(12); System.out.println("rest of the code");
		 */
		
		ThrowThrowsDemo obj=new ThrowThrowsDemo();
		obj.method3();

	}

}
