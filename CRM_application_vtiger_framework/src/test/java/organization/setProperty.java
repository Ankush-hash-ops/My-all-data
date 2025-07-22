package organization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class setProperty {

	public static void main(String[] args) throws IOException {
//		Get the  java representation object of the physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\java_ws\\CRM_application_vtiger_framework\\src\\test\\resources\\commonData.properties");
		
//        by using load method ,load all keys
		 Properties pObj=new Properties();
		 pObj.load(fis);
		
//		 by using getProperty(),get the values
		String URL= pObj.getProperty("url");
		System.out.println(URL);
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\java_ws\\CRM_application_vtiger_framework\\src\\test\\resources\\commonData.properties");
		
		
		pObj.setProperty("name", "ankush");
		pObj.store(fos,"name ankush");
		
		
		
		
	}
	

}
