package com.string;

import java.util.Scanner;

public class ErrorSample {

	public static void main(String[] args) {
		
		
		  String str=null;
		  try {
		   System.out.println(str.length());
		  System.out.println(str.charAt(0));
		  }
		  catch(NullPointerException nl )
		  {
			  System.out.println("the refernec is null");
		  }
		
			
			  int[] arr=new int[4]; 
			  try
			  {
			  int i=arr[4];
			  }
			  catch(ArrayIndexOutOfBoundsException ar)
			  {
				  System.out.println("array size range ke bahar hai");
			  }
			  System.out.println("i want to execute");
			 
			  try
			  {
			  int num=Integer.parseInt("padmaja");
			  }
			  catch(NumberFormatException nf)
			  {
				  System.out.println("data foemat is incorrect");
			  }
			 // System.out.println(num);
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vale for num1");
		int num1=sc.nextInt();
		System.out.println("enter the vale for num2");
		int num2=sc.nextInt();
		//int result;
		try
		{
		System.out.println(num1/num2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("divion by zero vala eeror aaya");
		}
		System.out.println("other code");
		
	}
	}
