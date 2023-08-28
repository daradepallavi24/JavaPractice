package com.java.demo.intro;


public class HelloWorld {
	
	 public static void main(String[] args)
	 {
	      int a = 60;	
	      int b = 13;	
	      int c = 0;
	      
	      c = a & b;       
	      System.out.println("a & b = " + c );
	      
	      c = a | b;       
	      System.out.println("a | b = " + c );

	      c = a ^ b;        
	      System.out.println("a ^ b = " + c );

	      c=a<<b;
	      System.out.println("a << b = " + c );
	      
	      c=a>>b;
	      System.out.println("a >> b = " + c );
	      
	      c=a>>>b;
	      System.out.println("a >>> b = " + c );
	      
	      //assignment oprator 
		int min=(a<b) ? a:b; 
		 
		 a+=10;  
		 a-=10;   
		 a/=10;
		 a*=10;
		 System.out.println(min);
		 
	      System.out.println("Hello Everyone"  );
	     }
}
