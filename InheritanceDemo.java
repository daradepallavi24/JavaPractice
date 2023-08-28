package com.java.demo.intro;

class Grandparent {
    String gName;

    void GrandParentMethod() {
        System.out.println(gName);
    }
}

class Parent extends Grandparent {
    String pName;

    void ParentMethod() {
        System.out.println(pName);
    }
}

class Child extends Parent {
    String cName;

    void childMethod() {
        System.out.println(cName); 
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.cName = "ChildName"; 
        ch.pName = "ParentName"; 
        ch.gName = "GrandparentName"; 

        ch.childMethod();
        ch.ParentMethod();
        ch.GrandParentMethod();
    }
}
