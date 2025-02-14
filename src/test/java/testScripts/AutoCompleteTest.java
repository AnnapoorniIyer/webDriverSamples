package testScripts;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoCompleteTest {
	public static final String  expValue = "JavaScript";																																																																		
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://jqueryui.com/autocomplete/");
	  WebElement frame1=driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frame1);
	  WebElement inp=driver.findElement(By.cssSelector("#tags"));
	  inp.sendKeys("sc");
	  Thread.sleep(2000);
	  List<WebElement> items=driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
	  System.out.println("Number of matching items...."+items.size());
      for(WebElement item:items) {
    	  System.out.println(item.getText());
    	  if(item.getText().equalsIgnoreCase(expValue)){
    		  item.click();
    		  break;
    		  
    	  }
      }
	  
	  
	  
	  
	  
	  
  }
}
