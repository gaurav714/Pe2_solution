package com.stackroute.Pe2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MemberVariableTest {
	@Test
	public void Test() {
		MemberVariable m1=new MemberVariable("Harry Potter", 30,2500.3);
		String result=m1.getValues();
		assertEquals(result,"Harry Potter 30 2500.3");
	}

}