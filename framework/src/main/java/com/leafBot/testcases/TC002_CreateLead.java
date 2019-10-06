package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class TC002_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="CreateLead";
		testcaseName="Create Lead";
		testcaseDec = "Create Lead to Leaftaps";
		author="Abdul";
		category="smoke";
		}
	@Test(dataProvider="fetchData")
	public void CreateLeadTestcase(String userName, String pass,String cName,String fName,String lName) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()		
		.clickCreateLead()		
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName)
		.verifyTitle();
	}
}
