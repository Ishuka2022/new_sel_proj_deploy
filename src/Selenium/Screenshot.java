package Selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Ajio.com/");
		
		 File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
     File dr = new File("D:\\Ishuka Software Notes\\SCREENSHOTS_AUTOMATION\\ajo.png");
     
     FileHandler.copy(sr, dr);
	}

}
