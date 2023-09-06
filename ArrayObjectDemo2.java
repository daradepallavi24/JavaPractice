package com.java.demo.intro;

class UserDefinedType {
    int i;

    public void method1() {
        System.out.println("from user defined type of object");
    }
}

public class ArrayObjectDemo {

    public static void main(String[] args) {
        int[] a;
        int a1[];
        UserDefinedType[] userDefineArray = new UserDefinedType[10];

        for (int i = 0; i < userDefineArray.length; i++) {
            userDefineArray[i] = new UserDefinedType();
        }
        userDefineArray[1].method1();
    }

    int m[] = { 3, 5, 7, 2, 7, 9 };

    int z[] = m;

    for (int i = 0; i < z.length; i++) {
        System.out.println(z[i]);
    }

    m[2] = 43;
    System.out.println(z[2]);

    m[4] = 59;
    System.out.println(z[4]);
}}
