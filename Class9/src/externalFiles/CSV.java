package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
/* CVS = Comma Separated Value. In the file every comma is a column and every line is a row
 * 
 */
	public static void main(String[] args) throws IOException {
		
		//Location of file
				String path = "TestData\\msCSV.csv";
				//String file = "TestData\\log_" + getTimeDate() + ".txt";//need getTimeDate() created here 
				
				//Setup for how to Write a textfile
				//creating an object of Class File
				File f = new File(path);
				
				//creating an object of Class FileWriter to write on file f
				FileWriter fw = new FileWriter(f);
				@SuppressWarnings("resource")
				
				//creating an object of Class BufferedWriter to BufferWrite to object fw which is a FileWriter/
				//BufferedWrite buffer the characters during a read so that the system is efficient. 
				BufferedWriter bw = new BufferedWriter(fw); //appending to a file 
		
				bw.write("name, class, grade");
				bw.newLine();
				bw.write("Jane, sql, 100");
				bw.newLine();
				bw.write("John, java, 90");
				bw.newLine();
				bw.write("Tim, cng, 80");
				bw.close();
		

	}

}
