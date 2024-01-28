package pom_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericUtility.WebDriverUtility;
public class CreatingNewOpportunityPage {
	
	WebDriver driver;
	public CreatingNewOpportunityPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="//input[@name=\"potentialname\"]")
	private WebElement opportunitiesNameTextField;
	
	@FindBy(xpath="//select[@id=\"related_to_type\"]/../..//img[@src=\"themes/softed/images/select.gif\"]")
	private WebElement organisationLookUpButton;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/select.gif\"][1]")
	private WebElement campaignSourceLookUpButton;
	
	@FindBy(name="closingdate")
	private WebElement closingDateCalenderTextfield;
	
	@FindBy(name="search_text")
	private WebElement campaignsignLookUpSearchTextField;
	
	@FindBy(name="search")
	private WebElement campaignLookupPagesearchButton;
	
	@FindBy(name="search_text")
	private WebElement organisationLookUpSearchTextField;
	
	@FindBy(name="search")
	private WebElement organisationLookupPagesearchButton;

	private WebElement campaignLookPageSearchTextField;

	private WebElement campaignLookUpPageSearchButton;

	public WebElement getOpportunitiesNameTextField() {
		return opportunitiesNameTextField;
	}

	public WebElement getOrganisationLookUpButton() {
		return organisationLookUpButton;
	}

	public WebElement getCampaignSourceLookUpButton() {
		return campaignSourceLookUpButton;
	}

	public WebElement getClosingDateCalenderTextfield() {
		return closingDateCalenderTextfield;
	}
	
	public void enterOpportuitiesName(String opportunitiesName) {
	opportunitiesNameTextField.sendKeys(opportunitiesName);
	
	}
	
    public void enterCampaignDetailsinCampaignSourceLookUpPage(String titleOfPageToSwitch, String campaignName) {
			
	String parentWindowTitle=driver.getTitle();
	campaignSourceLookUpButton.click();
	WebDriverUtility wUtils=new WebDriverUtility();
	wUtils.switchToChildBorwser(driver, titleOfPageToSwitch);
	campaignLookPageSearchTextField.sendKeys(campaignName);
	campaignLookUpPageSearchButton.click();
	driver.findElement(By.xpath("//a[text()='"+campaignName+"']")).click();
	wUtils.switchToChildBorwser(driver, parentWindowTitle);
	
	}
}
