package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest {
  @Test
  public void selectvalue() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Select sel=new Select(driver.findElement(By.id("country")));
	  sel.selectByValue("usa");
	  sel.selectByVisibleText("United Kingdom");
	  sel.selectByIndex(5);
	  
	  
  }
}
