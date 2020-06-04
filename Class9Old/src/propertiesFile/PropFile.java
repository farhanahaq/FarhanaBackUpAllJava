package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFile {
/*



 */
	public static void main(String[] args) throws IOException {
	
		@SuppressWarnings("unused")
		
		//telling the location of the file
		//absolute path
		String path = "C:\\Users\\14693\\eclipse-workspace-1\\CLass9\\src\\config.properties";
		
		//don't have to mention anything before src for location wise just file name is good here
		
		//insdie src standalone file no folder 
		String location = "src\\config.properties";
		
		//inside src and inside a folder
		String dataPAth = "src\\data\\myData.properties";
		
		//diff folder outside of src but same project
		String myTestData = "TestData\\test.properties";
		
		//getting file and values
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		System.out.println(prop.getProperty("bwIE"));
		
		//text file 
		
		
	}//end of main

	
	
}//end of class
