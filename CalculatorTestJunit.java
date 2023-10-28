package com.junitdemo;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator1Test {

    private Calculator1 cal;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
       
    }

    @Before
    public void setUp() throws Exception {
        cal = new Calculator1();
    }

    @Test
    public void test1() {
        assertEquals(3, cal.add(2, 1));
        assertEquals(4, cal.add(2, 2));
        assertEquals(3, cal.add(0, 3));
        assertEquals(-1, cal.findMax(new int[]{-12, -1, -3, -4, -21}));
        assertEquals(4, cal.findMax(new int[]{-1, 1, 3, 4, 2}));
    }

    @Test
    public void test2() {
        assertEquals(3, cal.add(1, 2));
        assertEquals(4, cal.add(1, 3));
        assertEquals(4, cal.findMax(new int[]{1, 3, 4, 2}));
    }


	@After
    public void tearDown() throws Exception {
        cal = null;
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        
    }
}
package com.junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/* 
public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
		
	}

	@Test
	public void test1() 
	{
		assertEquals(3, cal.add(1, 2));
		//assertEquals(4, cal.add(1, 2));
		
	}
	@Test
	public void test2() 
	{
		//assertEquals(3, cal.add(1, 2));
		//assertEquals(4, cal.add(1, 2));
		
	}
	@Test
	public void test3() {
	    assertEquals(0, cal.add(0, 0));
	}

	@Test
	public void test4() {
	    assertEquals(-5, cal.add(-2, -3));
	}

	@Test
	public void test5() {
	    assertEquals(10, cal.add(5, 5));
	}

	@Test
	public void test6() {
	    assertEquals(10, cal.add(10, 0));
	}

	@Test
	public void test7() {
	    assertEquals(5, cal.subtract(10, 5));
	}

	@Test
	public void test8() {
	    assertEquals(2, cal.subtract(5, 3));
	}

	@Test
	public void test9() {
	    assertEquals(0, cal.subtract(0, 0));
	}

	@Test
	public void test10() {
	    assertEquals(25, cal.multiply(5, 5));
	}

	@Test
	public void test11() {
	    assertEquals(0, cal.multiply(0, 5));
	}

	@Test
	public void test12() {
	    assertEquals(-15, cal.multiply(3, -5));
	}

	@Test
	public void test13() {
	    assertEquals(4, cal.divide(12, 3));
	}

	@Test
	public void test14() {
	    assertEquals(0, cal.divide(0, 5));
	}

	@Test
	public void test15() {
	    assertEquals(2, cal.divide(5, 2));
	}




	@After
	public void tearDown() throws Exception {
		cal=null;
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}*/