import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrianglescheckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void invalidTriangleTest() 
	{
		Trianglescheck tester = new Trianglescheck();
		String actual = tester. classifyTriangle (0,0,0);
		String expected = "Length of any side of the triangle cannot be zero";
		Object assertEquals;
		assertEquals (actual, expected);
	}
	
	@Test
	public void equilateralTest() 
	{
		Trianglescheck tester = new Trianglescheck();
		String actual = tester. classifyTriangle (5,5,5);
		String expected = "Equilateral";
		Object assertEquals;
		assertEquals (actual, expected);
	}
	@Test
	public void isoscelesTest() 
	{
		Trianglescheck tester = new Trianglescheck();
		String actual = tester. classifyTriangle (5,5,3);
		String expected = "Isosceles";
		Object assertEquals;
		assertEquals (actual, expected);
	}
	@Test
	public void scaleneTest() 
	{
		Trianglescheck tester = new Trianglescheck();
		String actual = tester. classifyTriangle (5,4,3);
		String expected = "Scalene";
		Object assertEquals;
		assertEquals (actual, expected);
	}
	@Test
	public void trueRightAngleTest() 
	{
		Trianglescheck tester = new Trianglescheck();
		String actual = tester.checkrightangle(5,4,3);
		String expected = "This is also a Right angle triangle";
		Object assertEquals;
		assertEquals (actual, expected);
	}
}
