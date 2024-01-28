	package pom_Repository;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	/**
	 * 
	 * @author HP
	 *
	 */
	public class HomePage {
	 WebDriver driver;
	  public HomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
	  }
	  
	  @FindBy(linkText="Leads")
	   private WebElement LeadsModule;
	  
	  @FindBy(linkText="Organizations")
	  private WebElement OrganizationsModule ;
	  
	  @FindBy(linkText="Contacts")
	  private WebElement ContactsModule;
	  
	  @FindBy(linkText="Opportunities")
	  private WebElement OpportunitiesModule;
	  
	  @FindBy(linkText="Products")
	  private WebElement ProductsModule;
	  
	  @FindBy(linkText="More")
	  private WebElement MoreDropDown;
	  
	  @FindBy(linkText="Campaigns")
	  private WebElement CampaignsModule;
	  
	  @FindBy(linkText="Vendors")
	  private WebElement VendorsModule;
	  
	  @FindBy(linkText="Sales Order")
	  private WebElement SalesOrderModule;
	  
	  @FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
		private WebElement adminitratorImage;
	  
	  @FindBy(linkText="Sign Out")
		private WebElement signOutModule;
	  public WebDriver getDriver() {
		return driver;
	  }
	
	  public WebElement getLeadsModule() {
		return LeadsModule;
	  }
	
	  public WebElement getOrganizationsModule() {
		return OrganizationsModule;
	  }
	
	public WebElement getOpportunitiesModule() {
		return OpportunitiesModule;
	}
	
	public WebElement getProductsModule() {
		return ProductsModule;
	}
	
	public WebElement getMoreModule() {
		return MoreDropDown;
	}
	
	public WebElement getCampaignsModule() {
		return CampaignsModule;
	}
	
	public WebElement getVendorsModule() {
		return VendorsModule;
	}
	
	public WebElement getSalesOrderModule() {
		return SalesOrderModule;
	}
	
	 public WebElement getAdminitratorImage() {
		return adminitratorImage;
	 }
	
	 public WebElement getSignOutOption() {
		return signOutModule;
	  }
	 
	 public void clickOnLeadsModule() {
		 LeadsModule.click();
	 }
	 
	 public void clickOnOrganizationsModule() {
		 OrganizationsModule.click();
	 }
	 
	 public void clickOnContactsModule() {
		 ContactsModule.click();
	 }
	 
	 public void clickOnOpportunitiesModule() {
		 LeadsModule.click();
	 }
	 
	 public void clickOnProductsModule() {
		 ProductsModule.click();
	 }
	 
	 public void clickOnMoreDropDown() {
		 MoreDropDown.click();
	 }
	 
	 public void clickOnCampaignsModule()
	 {
		Actions action=new Actions(driver);
		action.moveToElement(MoreDropDown).perform();
		action.click(CampaignsModule).perform() ;
	 }
	 
	 public void clickOnSignOut()
	 {
		Actions action=new Actions(driver);
		action.moveToElement(adminitratorImage).perform();
		action.click(signOutModule).perform() ;
	 }

	public void signOutAction() {
		// TODO Auto-generated method stub
		
	}
	 
	 
					
	}
