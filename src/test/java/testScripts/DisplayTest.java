package testScripts;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisplayTest {
  @Test
  public void displayElement() throws IOException {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  TakesScreenshot screen=(TakesScreenshot)driver;
	  File src=screen.getScreenshotAs(OutputType.FILE);
	  String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
	  FileUtils.copyFile(src,new File(path));
	  driver.findElement(By.id("searchBar")).sendKeys("Test");
	  WebElement closeIcon=driver.findElement(By.cssSelector("a[title='Clear text']"));
	  System.out.println(closeIcon.isDisplayed());
	  if(closeIcon.isDisplayed())
	  {
		  closeIcon.click();
	  }
	  }
}
  
