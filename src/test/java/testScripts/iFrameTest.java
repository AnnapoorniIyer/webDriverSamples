package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {
  @Test
  public void iFrame () {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/iframe");
	  //driver.switchTo().frame("mce_0_ifr");
	 // driver.switchTo().frame(0);
	  WebElement iFrameElem=driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(0);
	  WebElement inputTxt=driver.findElement(By.id("tinymce"));
	  		//inputTxt.clear();
	  		String strTxt=inputTxt.getText();
	  		System.out.println("Txt from Frame"+strTxt);
	  		
	  		driver.switchTo().parentFrame();
	  		driver.switchTo().defaultContent();
	  		WebElement linkTxt=driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
	  		linkTxt.click();
	  		
	  		
	  		
	  
  }
}
