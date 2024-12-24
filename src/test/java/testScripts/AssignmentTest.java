package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentTest {
	WebDriver driver;
  @Test
  public void f() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://danube-webshop.herokuapp.com");
	 driver.findElement(By.id("login")).click();
	  WebElement searchbox=driver.findElement(By.id("n-email"));
	  searchbox.sendKeys("annu@gmail.com");
	  WebElement searchbox1=driver.findElement(By.id("n-password2"));
	  searchbox1.sendKeys("Annapoorni@24"); 
	  driver.findElement(By.id("goto-signin-btn")).click();
	  
  }
}
