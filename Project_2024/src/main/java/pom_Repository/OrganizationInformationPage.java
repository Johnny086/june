package pom_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {	
	
	WebDriver driver;
	public OrganizationInformationPage(WebDriver driver) {

	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	
	public String verifyOrganizationInformation(String OrganizationName) {
	return driver.findElement(By.xpath("//span[contains(text(),'"+OrganizationName+"')]")).getText();
	}
		
}
