package com.java.demo.intro;
class A
{
	int i;
	void method1()
	{
		System.out.println("From class A");
	}
}
class B extends A
{
	@Override   // Annoatation
	void method1()
	{
		System.out.println("From class B");
	}
}

public class ArrayInJava {

	public static void main(String[] args) 
	{
		
		/*
		 * A a=new A(); a.method1();
		 */
		
		/*
		 * B b=new B(); b.method1(); //calling A method b.method1(); // calling B method
		 */		
		/*
		 * A a=new A(); a.method1();
		 * 
		 * A a1=new B(); // upcasting
		 * 
		 * a1.method1();
		 */
		/*
		 * A a=new B();
		 * 
		 * 
		 * B b =new A(); // downcasting
		 * 
		 */
		A object1=new A();
		 A[] object=new A[10]; // super class array object. 
		 for(int i=0; i<object.length;i++)
		 {
			 object[i]=new B(); 
			 object[i].method1(); 
		 }
		 
		 	

	}

}
