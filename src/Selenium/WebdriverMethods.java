package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Duplication;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                // get method
		
		String title = driver.getTitle();
		System.out.println(title);                             // getTitle Method
		
		String url = driver.getCurrentUrl();
		System.out.println(url);                              // getCurrentUrl Method
		
		driver.manage().window().maximize();                // Maximize Method
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");      // Navigate Method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.navigate().back();

		driver.close();                                    //close Method
		
		
		
		
	}

}
