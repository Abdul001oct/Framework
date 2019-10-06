package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class ViewLeadsPage extends SeleniumBase{
	public ViewLeadsPage verifyFirstName(String fName) {
		String firstName =locateElement("xpath", "//span[text()='" + fName + "']").getText();
		//String firstName = driver.findElementByXPath("//span[text()='" + fName + "']").getText();
		if (firstName.equals(fName)) {
			System.out.println("First Name Matches");
		} else {
			System.out.println("First Name Not Matches");
		}
		return this;
	}

	public ViewLeadsPage verifyTitle() {
		
		if(driver.getTitle().contains("View Lead")){
			System.out.println("Title Match");
		}
		else {
			System.out.println("Title does not match" + driver.getTitle());
				}
		return this;
	}
	public EditLeadsPage clickEditButton() {
		
		driver.findElementByLinkText("Edit").click();
		return new EditLeadsPage();
	}

	public ViewLeadsPage verifyCompanyName(String cName) {
		if (driver.findElementById("viewLead_companyName_sp").getText().startsWith(cName) == true) {
			System.out.println("Company name updated correctly");
		} else
			System.out.println("Company name Not updated correctly");
		return this;
	}

}
