package com.java.demo.intro;

/*class StaticDemo
{
	static int a=1;               
	
	public void dispaly()
	{
		a++;
		System.out.println(a);
	}
}


public class JavaDemo {

	
	public static void main(String[] args) {
		
		StaticDemo sd=new StaticDemo();
		sd.dispaly();
		StaticDemo sd2=new StaticDemo();
		sd2.dispaly();
		StaticDemo sd3=new StaticDemo();
		sd3.dispaly();

	}

}*/



//method overloading
/*class Addition
{
	
	
	  public void add(int a, int b) 
	  {
		  int result=a*b;
	  System.out.println(result);
	  }
	 
	public int add(int a, float b)  
	{
		float result=a+b;
		//System.out.println(result);
		return (int) result;
	}
	
	
	public double add(int a,int b, double c)
	{
		double result=a*b*c;
		//System.out.println(result);
		return result;
	}
	public void add(int a)
	{
		int result=a*a;
		System.out.println(result);
	}
	
}

public class JavaDemo {

	
	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.add(4);
		a.add(3, 6);
		a.add(3, 7, 8);

	}

}*/


//method overrirding
class ABC
{
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
}
class MNC extends ABC
{
	public void add(int a, int b)
	{
		int result=a*b;
		System.out.println(result);
	}
}
public class JavaDemo {

	
	public static void main(String[] args) {
		
		ABC a=new MNC();   
		a.add(3, 9);
	}
	

}