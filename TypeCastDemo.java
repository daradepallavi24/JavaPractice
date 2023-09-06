package com.demo;
/*There are two types of casting,

1) Primitive Casting.
These are data types with no decimal places.
1) byte   1byte  2) short    2byte 3) int     4 byte 4) long 8 byte

and these are data types with decimal places.
float  4 byte double  8byte

2) Derived Casting
*/
/*public class TypeCastDemo {

	public static void main(String[] args) {
		
		short i=10;
		
		int a;
		
		a=i;    //Implicit casting Auto Widening//automatically
		
		
		long e=20;
		
		int m;
		
		m=(int) e;  //explicit casting Explicit Narrowing
		
		System.out.println(a);
		
	}
	}*/


	/*There are two types of casting,

	1) Primitive Casting.
	These are data types with no decimal places.
	1) byte   1byte  2) short    2byte 3) int     4 byte 4) long 8 byte

	and these are data types with decimal places.
	float  4 byte double  8byte

	2) Derived Casting
	*/

	class Z
	{
		int i=10;
	}
	class B extends Z
	{
		int j=20;
	}
	class C extends B
	{
		int k=30;
	}
	class D extends C
	{
		int m=40;
	}
	public class TypeCastDemo {

		public static void main(String[] args) {
			
			D d=new D();
			C c=d;  // D type object is Auto-Up Casted to C type
			B b=d;	// D type object is Auto-Up Casted to B type
			
			C c1=new C();
			Z a=c1;  // C type object is Auto-Up Casted to A type
			Z a1 = new B();
			
		}

	}


