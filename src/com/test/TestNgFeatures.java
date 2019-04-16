package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		
		//below statement is used to fail this test case.So, homePageTest will also fail,as it depends on loginTest
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("HomePageTest is totally dependent on login test");
	}

	@Test(dependsOnMethods="loginTest")
	public void searchPageTest() {
		System.out.println("searchPageTest is totally dependent on login test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regPageTest() {
		System.out.println("regPageTest is totally dependent on login test");
	}

}
