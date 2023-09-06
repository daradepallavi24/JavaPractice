package com.java.demo.intro;

/*public class ArrayInJavaOne {

	
	static void methodOne(double[] d) // array of primitive type as a parameter
	{
		d[1]=23.6;
		d[3]=53.9;
	}

	
	public static void main(String[] args) {
		
		double[] d=new double[5];
		
		d[1]=45.6;
		d[3]=33.9;
		//ArrayInJavaOne a1=new ArrayInJavaOne();
		methodOne(d);
		
		System.out.println(d[1]);
		System.out.println(d[3]);

	}
	
}

*/

//Passing Array Of Primitive Type As A Parameter to The Method 

//Passing Array Of Derived Type As A Parameter to The Method :

class AB
{
	int i;  //field//property
}
public class ArrayInJavaOne {

	static void methodOne(AB[] a)
	{
		a[2].i=40; // changing the value of field of A-Type object referred by element at index 2
		a[3].i=90;// changing the value of field of A-Type object referred by element at index 3
		
	}
	public static void main(String[] args)
	{
		AB[] a=new AB[5];
		
		a[2]=new AB(); //creating AB-type object and assigning it to element at index 2
		a[3]=new AB(); //creating AB-type object and assigning it to element at index 3 
		
		a[2].i=10; // changing the value of field of AB-Type object referred by element at index 2
		a[3].i=30;// changing the value of field of AB-Type object referred by element at index 3
		
		methodOne(a); //array type of object passing
		
		System.out.println(a[2].i);
		System.out.println(a[3].i);
	
	
	
	/*
	 * static void methodOne(double[] d) // array of primitive type as a parameter {
	 * d[1]=23.6; d[3]=53.9; }
	 */
	
	
		
		/*double[] d=new double[5];
		
		d[1]=45.6;
		d[3]=33.9;
		//ArrayInJavaOne a1=new ArrayInJavaOne();
		methodOne(d);
		
		System.out.println(d[1]);
		System.out.println(d[3]);
*/
	}
	
}

