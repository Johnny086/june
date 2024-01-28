package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * Thishas generic method to fetch data from properties file 
 * @author HP
 * @return
 * Throws Exception
 */
public class FileUtility {

 public String fetchDataFromPropetiesFile(String key) throws IOException {
  FileInputStream fis=new FileInputStream(IPathConstant.PROPERTIES_FILE_PATH);
  Properties pop=new Properties();
  pop.load(fis);
  return pop.getProperty(key);
 
 }
 
	
}
