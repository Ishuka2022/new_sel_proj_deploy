package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_AllData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Guru99Bank Project\\Data.xlsx");
		  Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
          int sc = sheet.getRow(0).getLastCellNum()-1;
          for(int i=0;i<=sc;i++)
          {
        	  Cell row = sheet.getRow(0).getCell(i);
        	   CellType type = row.getCellType();
                     System.out.println(type);
                     
                     if(type==CellType.STRING)
             		{
             			String rst1 = row.getStringCellValue();
             			System.out.println(rst1);
             		}

             		else if(type==CellType.NUMERIC)
             		{
             			double rst2 = row.getNumericCellValue();
             			System.out.println(rst2);
             		}
             		else if(type==CellType.BOOLEAN)
             		{
             			 boolean rst3 = row.getBooleanCellValue();
             			 System.out.println(CellType.BOOLEAN);
             		}
          }
	}

}
