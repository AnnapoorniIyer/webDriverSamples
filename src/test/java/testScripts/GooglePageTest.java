package testScripts;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class GooglePageTest {
	WebDriver driver;
  @Test
  public void seleniumSearchTest() {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 // WebElement searchBox = driver.findElement(By.id("APjFqb"));
	 // WebElement searchBox = driver.findElement(By.name("q"));
	  WebElement searchBox = driver.findElement(By.className("gLFyf"));
	  //WebElement searchBox = driver.findElement(By.tagName("textarea");
	  searchBox.sendKeys("Selenium Tutorials");
	  //searchBox.sendKeys(Keys.ENTER);
	  searchBox.submit();
	
	  System.out.println("Page Title is:" + driver.getTitle());
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  //Assert.assertEquals(driver.getTitle(),"Selenium Tutorials - Google Search");
  }
}
