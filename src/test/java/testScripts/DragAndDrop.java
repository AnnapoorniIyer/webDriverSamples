package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
  @Test
  public void f() 
 
  {
	 ChromeDriver driver=new ChromeDriver();
	  Actions actions1=new Actions(driver);
	 driver.get("https://testautomationpractice.blogspot.com/");
	 WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
	  WebElement txtField=driver.findElement(By.id("field2"));
	  actions1.scrollToElement(txtField).perform();
	  actions1.moveToElement(btn).perform();
	  WebElement item21=driver.findElement(By.linkText("Laptops"));

  }
}
