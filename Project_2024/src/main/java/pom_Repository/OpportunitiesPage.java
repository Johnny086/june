package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {

	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title=\"Create Opportunity...\"]")
	private WebElement addOpportunityPlusButton;

	public WebElement getAddOpportunity() {
		return addOpportunityPlusButton;
	}
	
	public void addOpportunityPlusButton() {
		addOpportunityPlusButton.click();
	}
	
	
}
