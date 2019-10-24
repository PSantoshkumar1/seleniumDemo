package com.testng;

import org.testng.Assert;

public class SoftAssert {
	
	
	public static void main(String[] args) throws Exception {
		
	
//	String Et = "tyss";
//	String At = "psk";
//	Assert.assertEquals(At, Et);
//	System.out.println("Actual is matching with expected titel");
//	
//	boolean Ex = true;
//	boolean Ax = true;
	
	//Assert.assertEquals(Ax, Ex);
	System.out.println("Actual is matching with expected titel");
	//Assert.assertNotEquals(s, s2, "Working");
	//Assert.assertTrue(true);// same for false
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(9, 19);
	System.out.println("pass");
	sa.assertAll();

	}

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
