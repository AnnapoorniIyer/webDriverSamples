package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDomTest {
  @Test
  public void ShadowElement() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://watir.com/examples/shadow_dom.html");
	  WebElement shadowHost=driver.findElement(By.cssSelector("div#shadow_host"));
	  
	  SearchContext context=shadowHost.getShadowRoot();
	  WebElement shadowContent=context.findElement(By.cssSelector("span#shadow_content"));
	  		System.out.println("Shadow DOM Content:"+shadowContent.getText());
	  		
	  		WebElement innerShadow=context.findElement(By.cssSelector("div#nested_shadow_host"));
	  		SearchContext innerContext=innerShadow.getShadowRoot();
	  		String innerTxt=innerContext.findElement(By.cssSelector("div#nested_shadow_content")).getText();
	  		System.out.println("Inner DOM Text:"+innerTxt);
	  		
	  		
	  
	  
	  
	  
  }
}
