package com.testng;

import java.util.ArrayList;

import org.testng.Assert;

public class ToList {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("tyss");
		al.add("Software");
		al.add("employee");
		al.add("santu");
		
		
		ArrayList a=new ArrayList();
		a.add("tyss");
		a.add("software");
		a.add("employee");
		a.add("santu");
		
		//boolean al1=true;
		//boolean
		Assert.assertEquals(al, a);
	}

}
