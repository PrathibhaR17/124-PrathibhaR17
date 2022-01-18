package Springmvcexample.utility;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator a= new Calculator();
		assertTrue(a.add(1,2)==3);
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		Calculator b= new Calculator();
		assertTrue(b.sub(2,2)==0);
	}
}
