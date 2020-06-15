package com.syntax.utils;

import com.pages.AddEmployeePageElements;
import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.pages.personalDetailsPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static personalDetailsPageElements pdetails;

	public static void initialize() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new personalDetailsPageElements();
	}
}
