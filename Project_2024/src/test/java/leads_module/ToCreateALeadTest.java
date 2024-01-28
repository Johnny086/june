package leads_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;

import genericUtility.BaseClass;
import genericUtility.IPathConstant;
import pom_Repository.HomePage;
import pom_Repository.LeadPlusButton;
import pom_Repository.CreatingNewLeadPage;
import pom_Repository.LeadInformationPage;

public class ToCreateALeadTest extends BaseClass {

 public void toCreatALeadAndToVerifytheLeadDetails() throws EncryptedDocumentException, IOException {
 // Test Data
 String leadSalutation=eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME,1,0);
 String leadFirstName=eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME,1,1);
 String leadLastName=eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME,1,2);
 String leadCompanyName=eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME,1,3);
 String leadAssignedToGroupOption=eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME,1,4);

 // Object creation statement of All POM classes 
 HomePage home=new HomePage(driver);
 LeadPlusButton plusButton=new  LeadPlusButton(driver);
 CreatingNewLeadPage creatLaead=new CreatingNewLeadPage(driver);
 LeadInformationPage leadinfo=new LeadInformationPage(driver);
 
 // Actual test Script
 home.clickOnLeadsModule();
 plusButton.clickOnleadPlusButton();
 creatLaead.selectleadSalutation(leadSalutation);
 creatLaead.enterFirstName(leadFirstName);
 creatLaead.enterLeadLastName(leadLastName);
 creatLaead.enterCompanyName(leadCompanyName);
 creatLaead.assignToGroupRadioButton();
 creatLaead.selectFromAssignToGroupDropDown(leadAssignedToGroupOption);
 creatLaead.clickOnSaveButton();
 String actualLeadInfo = leadinfo.verifyLeadInformationPage(leadFirstName, leadLastName);
 Assert.assertEquals(actualLeadInfo, leadLastName);
 System.out.println("The Lead has been created");
 
 }

}
