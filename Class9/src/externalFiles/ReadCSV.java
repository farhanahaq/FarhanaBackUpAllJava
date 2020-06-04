package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		//Location of text file
		String path = "TestData\\msCSV.csv";
				
		//Set up for Reading from TextFile we need these 3 things
		//creating an object of Class File
		File f = new File(path);
		
		//creating an object of Class FileReader to read the file 
		FileReader fr = new FileReader(f);
		@SuppressWarnings("resource")
		
		//creating an object of Class BufferedWriter to Bufferedread to object fw which is a FileWriter/
		//Bufferedread buffer the characters during a read so that the system is efficient. 
		BufferedReader br = new BufferedReader(fr);
		
		List<String> ls = new ArrayList<String>();
		String line = null;
		
		while((line=br.readLine())!= null) { //while the file is not empty
			//System.out.println(line);
			ls.add(line);//add item to ArrayList
		}

		System.out.println(ls.get(1));//getting 2nd item from the list
		String newStr = ls.get(1); //creating a String variable from a list
		String[] newArry = newStr.split(","); //creating an array from a string separating by comma
		System.out.println(newArry[1]); //printing the array
		
		
		

	}

}
