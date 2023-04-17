package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_MultiSelectableOption {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Guru99Bank Project\\Day 1\\MultiSelectableListbox (2).html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement multi = driver.findElement(By.xpath("//select[@id='1234']"));
		            Select sc = new Select(multi);
                      sc.selectByVisibleText("RUS");
                      Thread.sleep(2000);
                      sc.selectByIndex(3);
                      Thread.sleep(2000);
                      sc.selectByIndex(1);
                      Thread.sleep(2000);
                      sc.deselectByIndex(3);
                      
              System.out.print("Print First Selectable Option : ");
                    String first = sc.getFirstSelectedOption().getText();
                    System.out.println(first);
                    
               System.out.println("Print All Options : ");
                   List<WebElement> opt = sc.getOptions();
                   for(WebElement s1:opt)
                   {
                	  String mul = s1.getText();
                	  System.out.println(mul);
                   }
                   
                System.out.println("Print all selected options : ");
                  List<WebElement> sel = sc.getAllSelectedOptions();
                  for(WebElement s2:sel)
                  {
                	 String selOpt = s2.getText();
                	 System.out.println(selOpt);
                  }
             System.out.println("To verify listbox is Multiselectable or not : ");
                   boolean Verify = sc.isMultiple();
                   System.out.println(Verify);
                   
                   if(Verify==true)
                   {
                	   System.out.println("Listbox is multiselectable");
                   }
                   else
                   {
                	   System.out.println("Listbox is singleselectable");
                   }
	}

}
