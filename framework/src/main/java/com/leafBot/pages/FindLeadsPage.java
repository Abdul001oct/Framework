package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;



public class FindLeadsPage extends SeleniumBase{
	public FindLeadsPage enterFirstName(String fName) {
		clearAndType(locateElement("xpath", "(//input[@name='firstName'])[3]"), fName);
		//driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		//driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}

	public ViewLeadsPage clickResultingLead() throws InterruptedException {
		Thread.sleep(5000);
		/*WebElement eleTable=locateElement("xpath", "(//table[@class='x-grid3-row-table'])[1]");
		List<WebElement> allColumns= locateElements("tagName", "td");
		String leadID = allColumns.get(0).getText();
		click(locateElement("link",leadID));*/
		WebElement eleTable = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]");
		List<WebElement> allColumns = eleTable.findElements(By.tagName("td"));
		String leadID = allColumns.get(0).getText();
		driver.findElementByLinkText(leadID).click();
		return new ViewLeadsPage();
	}

}
