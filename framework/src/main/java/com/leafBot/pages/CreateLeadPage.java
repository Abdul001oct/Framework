package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class CreateLeadPage extends SeleniumBase {

	public CreateLeadPage enterCompanyName(String cName) {
		
		clearAndType(locateElement("id", "createLeadForm_companyName"),cName);
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}

	public CreateLeadPage enterFirstName(String fName) {
		clearAndType(locateElement("id", "createLeadForm_firstName"),fName);
		//driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}

	public CreateLeadPage enterLastName(String lName) {
		clearAndType(locateElement("id", "createLeadForm_lastName"),lName);
		//driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	 public ViewLeadsPage clickCreateLeadButton() {
		 click(locateElement("class", "smallSubmit"));
		// driver.findElementByClassName("smallSubmit").click();
		 return new ViewLeadsPage();
	 }

}
