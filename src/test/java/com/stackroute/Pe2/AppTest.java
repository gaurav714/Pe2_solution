package com.stackroute.Pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest{
	
	private static App app;
	@BeforeClass
	public static void setup()
	{
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		app= new App();

	}
	
	@AfterClass
	public static void teardown()
	{
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		app = null;

	}
	//question 1
	/*	@Test
	public void testPalindrome()
	{
		assertEquals( "","acbca", app.palindrome("acbca"));

	}
	@Test
	public void testPalindromeFailure() {
		assertNotEquals("","acbac",app.palindrome("acbca"));
		
	}
	@Test
	public void testPalindromeNotNull() {
		assertNotNull("",app.palindrome("acbca"));
		
	}*/
//	question 1
		@Test
	public void testPalindrome() {
			assertEquals(true,app.palindrome("acbca"))	;
			assertTrue(app.palindrome("acbca"));
			assertFalse(app.palindrome("abcd"));
		
	}
	
	//question 2
		@Test
		public void testPowFour()
		{
			assertEquals("",4,app.powFour(64));
			assertNotEquals("",4,app.powFour(60));
			assertNotNull(app.powFour(4));
		}
	
}