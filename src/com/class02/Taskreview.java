package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class Taskreview extends CommonMethods{
	@BeforeMethod
	public void setup() {
		setUp();
	}
	@AfterMethod
	public void tearDown1() {
		tearDown();
	}
	
@Test
public void test1() {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
