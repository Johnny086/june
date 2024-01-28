package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *@param sheetName
 *@param rowNo
 *@param cellNo
 *@return
 *@throws EncryptedDocumentException 
 *@author HP
 *
 */
public class ExcelUtility {

 public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
  FileInputStream fis=new FileInputStream(IPathConstant.EXCEL_FILE_PATH);	 
  return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
   
 }
 /**
  * 
  * @param sheetName
  * @param rowNo
  * @param cellNo
  * @return
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public double fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
	  FileInputStream fis=new FileInputStream("./src/test/resources/TestData/VtigerTestData.xlsx");	 
	  return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
	  
 }
 /**
  * 
  * @param sheetName
  * @param rowNo
  * @param cellNo
  * @return
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
	  FileInputStream fis=new FileInputStream("./src/test/resources/TestData/VtigerTestData.xlsx");	 
	  return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	 	  
 }
}
