package com.class01;

import org.testng.annotations.*;

public class Task2 {
	@BeforeClass
	public void beforeMethod() {
		System.out.println("");
	}
	
	
 @Test
 public void test1() {
	 System.out.println("This is test 1");
 }
 @Test
 public void test2() {
	 System.out.println("This is test 2");
 }
}
