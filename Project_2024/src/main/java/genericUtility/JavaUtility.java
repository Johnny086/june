package genericUtility;

import java.sql.Date;
import java.util.Random;

public class JavaUtility {
	
 public int generateRandomNo( int limit) {
	Random ran=new Random();
	return ran.nextInt(limit);
 }
 
 public String generateSystemDateTime() {
	Date date=new Date(0);
	return date.toString().replace(" ", "_").replace(":", "_");
 }

}
