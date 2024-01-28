package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPlusButton {
    WebDriver driver;
	public LeadPlusButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement LeadsPlusButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLeadsPlusButton() {
		return LeadsPlusButton;
	}
	
	public void clickOnleadPlusButton() {
		LeadsPlusButton.click();
	
	}	
}
