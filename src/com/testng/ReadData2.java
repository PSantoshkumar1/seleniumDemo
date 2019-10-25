package com.testng;

import org.testng.annotations.Test;

public class ReadData2 {

	//@Test(dataProviderClass=ReadData.class,dataProvider=("CreateUser");
			public void test(String user,String pass)
			{
		System.out.println(user);
		System.out.println(pass);
			}
			

}
