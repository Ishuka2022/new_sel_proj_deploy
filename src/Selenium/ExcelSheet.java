package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Guru99Bank Project\\Data.xlsx");
		Cell sh = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1);
             CellType type = sh.getCellType();
         if(type==CellType.STRING)
         {
        	String str = sh.getStringCellValue();
        	System.out.println(str);
         }
         else if(type==CellType.NUMERIC)
         {
        	double num = sh.getNumericCellValue();
        	System.out.println(num);
         }
         else if(type==CellType.BOOLEAN)
         {
        	boolean bol = sh.getBooleanCellValue();
        	System.out.println(bol);
         }
         
         
	}

}
