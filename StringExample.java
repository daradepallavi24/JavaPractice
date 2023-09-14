package com.Interface.demo;

public class StringExample {  
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(str1);
        String str3 = new String("Java");
        String str4 = str1 + str2;
        String str5 = "hello" + "Java";
        String str6 = "hello";
        String str7 = "hello" + "world";
        str7 = str7.concat("world");
        str1.equals(str2);    //true
        Object s = null;
		s.equals(str1) ; 

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        System.out.println("str6: " + str6);
        System.out.println("str7: " + str7);
    }  
}
 
