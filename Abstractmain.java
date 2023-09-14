package com.demo;
abstract class Emp
{
	public String name;
	public double baseSalary;
	
	public Emp(String name, double baseSalary) 
	{
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	public abstract double calculateSalary();
	public abstract void displayInfo();
	
}

class Manager extends Emp
{
	public double bonus;
	
	public Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		
		return baseSalary+bonus;
	}

	@Override
	public void displayInfo() {
		System.out.println("Manager Name" +name);
		System.out.println("Manager Base salary" + baseSalary);
		System.out.println("Manager Bonus" +bonus);
		System.out.println("Total salary " + calculateSalary());
		
	}	
	
}

class Programmer extends Emp
{
	public int overTimeHours;
	public  double hourlyRate;

	public Programmer(String name, double baseSalary, int overTimeHours, double hourlyRate) {
		super(name, baseSalary);
		this.overTimeHours=overTimeHours;
		this.hourlyRate=hourlyRate;
		
		
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary+(overTimeHours * hourlyRate);
	}
	@Override
	public void displayInfo() {
		System.out.println("Programmer Name" +name);
		System.out.println("Programmer Base salary" + baseSalary);
		System.out.println("Programmer overTimeHours" +overTimeHours);
		System.out.println("Programmer hourlyRate" +hourlyRate);
		System.out.println("Total salary " + calculateSalary());
	}
	
}

public class Abstractmain {

	public static void main(String[] args) {
		
		/*
		 * Manager man=new Manager("Vassem", 10000, 50000);
		 * 
		 * man.displayInfo();
		 * 
		 * Programmer pro=new Programmer("shuklesh",10000, 7, 500);
		 * 
		 * pro.displayInfo();
		 * 
		 */
		Emp manager=new Manager("Vassem", 10000, 50000);
		Emp programmer=new Programmer("shuklesh",10000, 7, 500);
		manager.displayInfo();
		System.out.println("------------");
		programmer.displayInfo();		

	}

}
