package com.testng;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LisstDemo.class)
public class DdemoListimpclass   
{
	@Test
	public void test1()
	{
		System.out.println("Santosh kumar");
	}
	@Test
	public void test2()
	{
		System.out.println("santosh kumar2");
		Assert.fail();
	}
	

}
