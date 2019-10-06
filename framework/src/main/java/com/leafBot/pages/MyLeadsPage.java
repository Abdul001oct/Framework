package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyLeadsPage extends SeleniumBase {
	public CreateLeadPage clickCreateLead() {
		click(locateElement("link","Create Lead"));
		//driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads() {
		click(locateElement("link","Find Leads"));
		//\driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}


}
