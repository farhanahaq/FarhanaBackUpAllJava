package externalFiles;
/*IQ: Can you create an html file? Yes I did. Used an extension.html to create an html file. 
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.TreeSet;

public class WriteHTML {

	public static void main(String[] args) throws IOException {
		
		//Location of file
		String path = "TestData\\web.html";
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
		
		//putting random numbers in the html file
		
		// create instance of Random class 
        Random rand = new Random(); 
       // int N = 100;
       
        //creating TreeSet to hold the value with no duplicate
        TreeSet<Integer> rn = new TreeSet<Integer>();
        
        //generating 500 random numbers from range 100 to 1000 with no duplicate
        while(rn.size()<500) {
		int rand_int1 = rand.nextInt((1000-100) + 1)+100; //range from 100 – 1000
    	rn.add(rand_int1);
        }
        
        //converting into array to print 
  	    Object[] myrn = rn.toArray();
		
		
		//putting html code to write in the .html file
		bw.write("<html><head><title>");
		bw.write("500 Random Number>");
		bw.write("</title><head><body><h1><center>My 500 Random numbers</center></h1>");
		bw.write("<ol>"); // finds order of the listing 
		for (Object item: myrn) {
			bw.write("<li>" + item + "</li>");
		}
		bw.write("</ol>");
		bw.write("</body></html>");
		bw.close();
		
		

      
	}

}
