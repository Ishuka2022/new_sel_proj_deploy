package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Prog1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\\\Guru99Bank Project\\\\Data.xlsx");
		 Cell sh = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2);
		        System.out.println(sh);
		CellType result = sh.getCellType();
		System.out.println(result);
		
		if(result==CellType.STRING)
		{
			String rst1 = sh.getStringCellValue();
			System.out.println(rst1);
		}

		else if(result==CellType.NUMERIC)
		{
			double rst2 = sh.getNumericCellValue();
			System.out.println(rst2);
		}
		else if(result==CellType.BOOLEAN)
		{
			 boolean rst3 = sh.getBooleanCellValue();
			 System.out.println(CellType.BOOLEAN);
		}
	}

}
