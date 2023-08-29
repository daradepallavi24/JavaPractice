package com.java.demo.intro;

public class ABC {
 int a; 

public void display()
{
	System.out.println(a);
}
}
class PQR
{
	public void show()
	{
		ABC object=new ABC();
		System.out.println(object.a);
	}
}
class XYZ extends ABC
{
	public void show1()
	{
	ABC object=new ABC();
	System.out.println(object.a);
	}
}
