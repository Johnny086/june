package pom_Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,CreatingNewLeadPage.this);
	}
	
	@FindBy(name="salutationtype")
	private WebElement leadeSalutationDropdown;
	
	@FindBy(name="firstname")
	private WebElement leadFirstNameTextBox;
	
	@FindBy(name="lastname")
	private WebElement leadLastNameTextBox;
	
	@FindBy(name="company")
	private WebElement leadCompanyNameTextBox;
	
	@FindBy(name="industry")
	private WebElement industryDropdown;
	
	@FindBy(xpath="//input[@value=\"T\"]")
	private WebElement LeadAssignGroupRadioButton;
	
	@FindBy(id="assigned_user_id")
	private WebElement LeadAssignDropDown;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	public WebElement getLeadNameSalutationDropdown() {
		return leadeSalutationDropdown;
	}

	public WebElement getLeadFirstNameTextBox() {
		return leadFirstNameTextBox;
	}

	public WebElement getLeadLastNameTextBox() {
		return leadLastNameTextBox;
	}

	public WebElement getLeadCompanyNameTextBox() {
		return leadCompanyNameTextBox;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getLeadAssignGroupRadioButton() {
		return LeadAssignGroupRadioButton;
	}

	public WebElement getLeadAssignDropDown() {
		return LeadAssignDropDown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void selectleadSalutation(String option) {
	Select select=new Select(leadeSalutationDropdown);
	select.selectByVisibleText(option);
	}
	
	public void enterFirstName(String firstName) {
		leadFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLeadLastName(String lastName) {
		leadLastNameTextBox.sendKeys(lastName);
	}
	
	public void enterCompanyName(String companyName) {
		leadCompanyNameTextBox.sendKeys(companyName);
	}
	
	public void assignToGroupRadioButton() {
		LeadAssignGroupRadioButton.click();
	}
	
	public void selectFromAssignToGroupDropDown(String option) {
		Select select=new Select(LeadAssignDropDown);
		select.selectByVisibleText(option);
	}
		
	public void clickOnSaveButton() {
		saveButton.click();
	}
}
