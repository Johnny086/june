	package pom_Repository;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	/**
	 * 
	 * @author HP
	 *
	 */
	public class LoginPage {
	 public LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	  @FindBy(name="user_name")
	  private WebElement usernametextField;
	  
	  @FindBy(name="user_password")
	  private WebElement passwordtextField;
	    
	  @FindBy(id="submitButton")
	  private WebElement loginButton;
	
	public WebElement getUsernametextField() {
		return usernametextField;
	}
	
	public WebElement getPasswordtextField() {
		return passwordtextField;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	  public void loginAction(String username, String password)
	  {
		  usernametextField.sendKeys(username);
		  passwordtextField.sendKeys(password);
	  }
	   
	}
