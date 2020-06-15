package com.class01;

import org.testng.annotations.*;

public class DifferentAnnotationDemo {
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suite");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		// GulMethod();
		System.out.println("Before Test case/ method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@Test
	public void test() {
		System.out.println("Actual Test is running...");

	}
//public void GulMethod() {
//	System.out.println("Hi from gul");
//}
}
