package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
	            
       // xpath Expression: xpath by using attribute
	                      // Enter UN
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("XYZ");
	                  Thread.sleep(3000);
	                     // Enter Password
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
	                   
	   // xpath Expression: xpath by using text
	                 // click on new account
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	                    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ishuka");
	    
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Godshe");
	}

}
