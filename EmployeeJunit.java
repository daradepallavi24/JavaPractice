package com.junitdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {

    private String name;
    private int empId;
    private int salary;

    public Employee(String name, int empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return empId == employee.empId &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId, salary);
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> emps = new ArrayList<Employee>();
        Employee emp1 = new Employee("PADMAJA", 1, 2324);
        Employee emp2 = new Employee("Radhika", 2, 2632);
        Employee emp3 = new Employee("Punam", 3, 2634);

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        return emps;
    }
}
/*package com.junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {

    private Employee[] expectedEmps = new Employee[3];

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        expectedEmps[0] = new Employee("PADMAJA", 1, 2324);
        expectedEmps[1] = new Employee("Radhika", 2, 2632);
        expectedEmps[2] = new Employee("Punam", 3, 2634);
    }

    @Test
    public void testGetEmployeeList() {
        Employee[] testOutput = Employee.getEmployeeList().toArray(new Employee[0]);

        for (int i = 0; i < expectedEmps.length; i++) {
            assertEquals(expectedEmps[i], testOutput[i]);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
*/