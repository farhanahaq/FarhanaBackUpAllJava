package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {

	public static void main(String[] args) throws IOException {
		//Excel File location to be read
		String path ="src\\Excel\\NewExcelFile.xlsx";
		
		//Need these 3 steps for reading any excel file
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);
		
		//Accessing Sheet/Row/Cell
		Sheet sh = wb.getSheetAt(0);
		Row r = sh.getRow(0);
		Cell c = r.getCell(1);
		
		//printing certain record 
		System.out.println(c);
		fi.close();
		
		
		

	}

}
