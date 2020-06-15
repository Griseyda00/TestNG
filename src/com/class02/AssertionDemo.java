package com.class02;

import org.testng.Assert;
import org.testng.annotations.*;

import com.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;

public class AssertionDemo extends CommonMethods {
	// This is also called Hard Assert
	@BeforeMethod
	public void openBrowserAndnavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	// AssertionError is handled within TestNG
	// Even if one Test Case fails, the others will executed

	@Test
	public void tittleValidation() {
		String expectedTittle = "Human Management System!!!";
		String actualTitle = driver.getTitle();

		// 1st way
		// Assert.assertEquals(actualTitle, expectedTitle);

		// 2nd way, You are giving a msg
		Assert.assertEquals(expectedTittle, actualTitle, "Title does not match");

		// if the (hard) assertion fails
		// the statements after assertion will not be executed.
		System.out.println("Text after assertion");
	}

	@Test
	public void logoValidation() {
		LoginPageElements login = new LoginPageElements();
		boolean logoDisplayed = login.logo.isDisplayed();

		// 1st way
		// Assert.assertEquals(logoDisplayed, true, "Logo is not displayed");

		Assert.assertTrue(logoDisplayed, "Logo is not displayed");
	}

}
