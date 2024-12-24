package testScripts;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpTest {
  @Test
  public void Popup() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/browser-windows");
	  String parentwin=driver.getWindowHandle();
	  System.out.println("Parent Win...."+parentwin);
	 // driver.findElement(By.xpath("//button[contains(text(),'New tab')]")).click();
	  Thread.sleep(3000);
	  actions.scrollByAmount(100,1200).perform();
	  driver.findElement(By.id("tabButton")).click();
	  System.out.println("Page Title is:"+driver.getTitle());
	  Set<String> wins=driver.getWindowHandles();
	  System.out.println("No of windows"+wins.size());
	  for(String child:wins) {
		  System.out.println("wind Handles"+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  driver.switchTo().window(child);
			  Thread.sleep(2000);
			  String h1TagText=driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("Text in Tab Window"+h1TagText);
		  
			  
		  }
	  }
	  driver.close();
	  driver.switchTo().window(parentwin);
	  Set<String> popwins=driver.getWindowHandles();
	  System.out.println("No of windows"+popwins.size());
	  for(String child:popwins)
	  {
		  System.out.println("Wind Handles"+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  driver.switchTo().window(child);
			  Thread.sleep(2000);
			  String h1TagText=driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("Text in popup win"+h1TagText);
			  
		  }
	  }
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.quit();
	  
	  
	  
	  
	  
	  
  }
  
}
