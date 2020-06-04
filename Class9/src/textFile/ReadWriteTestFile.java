package textFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteTestFile {
		//we dont have any class like Properties to Read from text file  like we do for properties file
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		/*
		//Location of text file
		String path = "TestData\\myData.txt";
		String writePath="TestData\\myNewTestFile.txt";
		
		//Set up for Reading from TextFile we need these 3 things
		//creating an object of Class File
		File f = new File(path);
		
		//creating an object of Class FileReader to read the file 
		FileReader fr = new FileReader(f);
		@SuppressWarnings("resource")
		
		//creating an object of Class BufferedWriter to Bufferedread to object fw which is a FileWriter/
		//Bufferedread buffer the characters during a read so that the system is efficient. 
		BufferedReader br = new BufferedReader(fr);
		
		//printing the text file line by like sequentially 
		//System.out.println(br.readLine());
		
		//While loop to printing lines as we want
		
		List<String> ls = new ArrayList<String>();
		
		String line;
		while((line=br.readLine())!= null) { //while the file is not empty
			//System.out.println(line);
			ls.add(line);//add item to ArrayList
		}
		System.out.println(ls.size());
		System.out.println(ls);
		System.out.println(ls.get(1));//getting 2nd item from the list
		
		//System.out.println(br.read());

		 
		 */
		
		//Location of file
		String path = "TestData\\myData.txt";
		String writePath="TestData\\myNewTestFile.txt";
		//String file = "TestData\\log_" + getTimeDate() + ".txt";//need getTimeDate() created here 
		
		//Setup for how to Write a textfile
		
		//creating an object of Class File
		File f = new File(writePath);
		
		//creating an object of Class FileWriter to write on file f
		FileWriter fw = new FileWriter(f, true);
		@SuppressWarnings("resource")
		
		//creating an object of Class BufferedWriter to BufferWrite to object fw which is a FileWriter/
		//BufferedWrite buffer the characters during a read so that the system is efficient. 
		BufferedWriter bw = new BufferedWriter(fw); //appending to a file 
		
		//bw.write("This is my first line in creating new text file");
		//bw.newLine();
		//bw.write("This is my 2nd line in creating new text file");
		//bw.newLine();
		//bw.close();
		
		for(int i=2; i<=100; i = i+2) {
			bw.write("This is my line number"+ i +"");
			bw.newLine();
		}
		
		bw.close();
		

		
	}

}
