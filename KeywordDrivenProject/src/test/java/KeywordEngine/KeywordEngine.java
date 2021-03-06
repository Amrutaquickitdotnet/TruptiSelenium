package KeywordEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import TestBase.TestBase;

public class KeywordEngine {
TestBase base = new TestBase();
	
	public Workbook book;
	public Sheet sh;
	
	
	
	public void readData() {
		
		 FileInputStream fs = null;
		String path = "G:\\Trupti\\KeywordDrivenProject\\src\\test\\resources\\exactdata.xlsx";
		
		 try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 HSSFWorkbook wb = new HSSFWorkbook();
		 
		try {
			book = WorkbookFactory.create(fs);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 sh =	book.getSheet("Sheet1");
	 
	 for(int i=1; i<= sh.getLastRowNum(); i++) {
	String testSteps =	 sh.getRow(i).getCell(0).toString().trim();
	String locatorType =	 sh.getRow(i).getCell(1).toString().trim();
	String selector =	 sh.getRow(i).getCell(2).toString().trim();
	String action =	 sh.getRow(i).getCell(3).toString().trim();
	String value =	 sh.getRow(i).getCell(4).toString().trim();
		 
	
	base.execute(testSteps, locatorType, selector, action, value);
	 }
		
	}
}
