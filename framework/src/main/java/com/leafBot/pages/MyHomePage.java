package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyHomePage extends SeleniumBase {
	public MyLeadsPage clickLeadsTab() {
		click(locateElement("link","Leads"));
		//driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
}
