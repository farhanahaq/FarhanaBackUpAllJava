package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		//XSSFWorkbook
		//HSSFWorkbook
		//.xls //.xlsx(latest)
		
		//creating objects for workbook/sheet
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("DataSheet");
		XSSFSheet sh1 = wb.createSheet("CheatCode");
		
		//creating row/cell
		Row r = sh.createRow(1);
		Cell c = r.createCell(0);
		c.setCellValue("Hello");
		
		//path for the file to be written 
		String path ="src\\Excel\\MyExcelFile.xlsx";
		
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f, true);
		
		wb.write(fo);
		fo.close();
		
		
		
		
		
		
		
		

	}

}
