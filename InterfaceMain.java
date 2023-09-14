package com.java.demo.intro;
/*class ABC
{
	// SIB
	static 
	{
		
	}
	//IIB
	{
		
	}
}*/
/*
final class ABC
{	
	final float pi=3.14f;// value is constant
	public void display()
	{
		
	}
}
class PQR extends ABC
{
	@Override
	public void display()
	{
		ABC a1=new ABC();
		//a1.a=20;
	}
}

*/
interface Employee  // interface bydefault abstract
{
	
	/*
	 * static {
	 * 
	 * } {
	 * 
	 * }
	 */
	//abstract Method
	// by default all method in a interface are abstract method
	
	
	
	 int a=0; //data member // by default public/final/static
	
	 double salary();  //absract method // method inside the interface are bydefault public
	void display();

	
	
}
interface project
{
	String projectName="LMS";
	void projectDetails();
	
}

class PermanatEmp implements Employee, project
{

	@Override
	public double salary() {
		//Employee.a=10;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void projectDetails() {
		// TODO Auto-generated method stub
		
	}
	
}

class ContractEmp implements Employee
{

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceMain {

	public static void main(String[] args) {
		

	}

}