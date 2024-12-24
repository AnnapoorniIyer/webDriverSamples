package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
  @Test
  public void AlertTest () {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.findElement(By.id("alertBtn")).click();
	  Alert alert=driver.switchTo().alert();
	  System.out.println(alert.getText());
	  alert.accept();
	  
	  driver.findElement(By.id("confirmBtn")).click();
	  Alert confirm=driver.switchTo().alert();
	  System.out.println(confirm.getText());
	  confirm.dismiss();
	  
	  driver.findElement(By.id("promptBtn")).click();
	  Alert prompt=driver.switchTo().alert();
	  System.out.println(prompt.getText());
	  prompt.sendKeys("Hello Welcome");
	  prompt.accept();
	  
	  
	  
	  
	  
	  
  }
}
