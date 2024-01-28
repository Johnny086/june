package genericUtility;

public interface IPathConstant {
 String PROPERTIES_FILE_PATH ="./src/test/resources/TestData/VtigerPropertyData.properties";
 String EXCEL_FILE_PATH ="./src/test/resources/TestData/VtigerTestData.xlsx";

 String SCREENSHOT_FILE_PATH="./Project_2024/src/test/resources/TakeScreenshot";
 
 String LEAD_SHEET_NAME="Leads";
 String ORGANISATION_SHEET_NAME ="Organisation";
 
 int IMPLICIT_WAIT=20;
 int EXPLICIT_WAIT=20;
 
 String JAVA_SCRIPT_COMMAND_FOR_CLICK="argument[0].click()";
 String JAVA_SCRIPT_COMMAND_FOR_ENTER_VALUE="argument[0].value=";
 String DATA_BASE_URL = null;
 String JAVASCRIPT_COMMAND_FOR_CLICK = null;
 
}
