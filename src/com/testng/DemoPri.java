package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoPri {

	@Test(dependsOnMethods="demo1")
	public void demom()
	{
		Reporter.log("Hello, true");
		
	}
	
	@Test
	public void demom1() {
		System.out.println("hi1");
	}
	@Test()
	public void demom2()
	{
		System.out.println("hi2");
	}
	
}
