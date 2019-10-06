package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class EditLeadsPage extends SeleniumBase {
public EditLeadsPage verifyTitle() {
		
		if(driver.getTitle().contains("opentaps")){
			System.out.println("Title Match");
		}
		else {
			System.out.println("Title does not match" + driver.getTitle());
				}
		return this;
	}
	
	public EditLeadsPage updatecompanyName(String cName) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
		return this;
		
	}

}
