package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC001 {
	
	//public static void main(String[] args) {
		
	@Test
	public void findCountry() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		//driver.findElementByXPath("(//div[@class='dropdown'])[5]").click();
		WebElement eleVendor = driver.findElementByXPath("//*[@id='dashmenu']/div[5]");
		
		Actions builder = new Actions(driver);	
		builder.moveToElement(eleVendor).perform();
		driver.findElementByPartialLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String country = driver.findElementByXPath("//*[contains(text(),'Blue')]/following-sibling::td[4]").getText();
		System.out.println(country);
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		//.click();
		//builder.moveToElement(eleVendor).click().perform();
		
		
	}

}
