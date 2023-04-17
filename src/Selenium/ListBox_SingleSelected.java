package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_SingleSelected 
{
  public static void main(String[] args) throws InterruptedException 
	{
	        WebDriver dri = new ChromeDriver();
	        dri.get("https://www.facebook.com/");
	        
	      dri.findElement(By.xpath("//a[text()='Create new account']")).click();
	       Thread.sleep(3000);
		WebElement date = dri.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(date);
		
	     s.selectByVisibleText("14");
		 // s.selectByValue("14");
		 // Thread.sleep(2000);
		System.out.print("Print ByDefault SelectedOption : ");
		String get = s.getFirstSelectedOption().getText();
		System.out.println(get);
		
		System.out.println("Print all options : ");
		List<WebElement> option = s.getOptions();
		for(WebElement s1:option)
		{
			String allopt = s1.getText();
			System.out.println(allopt);
		}
		
	    Thread.sleep(2000);
		WebElement month = dri.findElement(By.xpath("//select[@id='month']"));
		     Select sc = new Select(month);
		      sc.selectByVisibleText("Oct");
		
		get = s.getFirstSelectedOption().getText();
		System.out.println(get);
	}

}
