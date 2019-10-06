package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
	
	public MyHomePage clickCRMSFA() {
		click(locateElement("link", "CRM/SFA"));
		//driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

	

}
