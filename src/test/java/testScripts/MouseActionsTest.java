package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActionsTest {
  @Test
  public void mouseactions() {

WebDriver driver=new ChromeDriver();  
driver.manage().window().maximize();
Actions actions=new Actions(driver);
driver.get("https://testautomationpractice.blogspot.com/");
WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
WebElement txtfield=driver.findElement(By.id("field2"));
actions.scrollToElement(txtfield).perform();
actions.moveToElement(btn).perform();
WebElement item2=driver.findElement(By.linkText("Laptops"));
actions.click(item2).perform();
//actions.moveToElement(btn).click(item2).build().perform();
WebElement btnDb1=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
actions.doubleClick(btnDb1).perform();
actions.contextClick(txtfield).perform();

//Drag and drop


		





  
  }
  
}
