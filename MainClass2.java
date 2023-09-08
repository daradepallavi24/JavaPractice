package com.java.demo.intro;

/*
 * We define a class called Employee with two private instance variables name (a String) and salary (a double).
 * We have a constructor for Employee that takes two parameters, name and salary, and initializes the instance variables.
 * Inside the Employee class, we have a work() method that prints a message indicating the employee's name is working.
 * We also have a getSalary() method in the Employee class, which returns the salary of the employee.
 * We define a subclass called HRManager that extends the Employee class.
 * The HRManager class has a constructor that takes name and salary as parameters and calls the constructor of the superclass (Employee) using super(name, salary) to initialize these values.
 * Inside the HRManager class, we override the work() method inherited from the Employee class. This overridden method prints a message indicating that the HRManager is managing HR tasks.
 * We use getName() to access the employee's name.
 * The HRManager class also has a addEmployee(Employee employee) method that takes an Employee object as a parameter and prints a message indicating that the HRManager is adding the specified employee.
 * It uses getName() to access the HRManager's name.
 * In the Main class, we create an Employee object named emp1 with the name "John" and a salary of 50000.0.
 * We create an HRManager object named hrManager with the name "Alice" and a salary of 60000.0.
 * We call the work() method on emp1, so it prints "John is working." because emp1 is an instance of the Employee class.
 * We print the salary of emp1, which is 50000.0.
 * We call the work() method on hrManager, so it prints "Alice is managing HR tasks." because hrManager is an instance of the HRManager class, and we have overridden the work() method.
 * We print the salary of hrManager, which is 60000.0.
 * We create another Employee object named emp2 with the name "Sarah" and a salary of 55000.0.
 * We call the addEmployee() method on hrManager, passing emp2 as a parameter. This prints "Alice is adding employee: Sarah" because hrManager is an instance of the HRManager class, and we have defined this method in the subclass.
 * */


	class Employee {
	    private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public void work() {
	        System.out.println(name + " is working.");
	    }

	    public double getSalary() {
	        return salary;
	    }

		public String getName() {
			return null;
		}
	}

	class HRManager extends Employee {
	    public HRManager(String name, double salary) {
	        super(name, salary);
	    }

	    @Override
	    public void work() {
	        System.out.println(getName() + " is managing HR tasks.");
	    }

	    public void addEmployee(Employee employee) {
	        System.out.println(getName() + " is adding employee: " + employee.getName());
	    }
	    
	    public String getName() {
	        return super.getName();
	    }
	}

	public class MainClass2 {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("John", 50000.0);
	        HRManager hrManager = new HRManager("Alice", 60000.0);

	        emp1.work(); 
	        System.out.println("Employee Salary: $" + emp1.getSalary());

	        hrManager.work(); 
	        System.out.println("HR Manager Salary: $" + hrManager.getSalary());

	        Employee emp2 = new Employee("Sarah", 55000.0);
	        hrManager.addEmployee(emp2); 
	    }
	}