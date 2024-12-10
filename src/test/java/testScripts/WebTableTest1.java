package testScripts;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class WebTableTest1 {
  @Test
  public void f() {
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> items=driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
		
	System.out.println("Number of items...."+items.size());
	for(WebElement item:items) {
		System.out.println("Item Value..."+item.getText());
		WebElement table=driver.findElement(By.xpath("//td[contains(text(), 'Smartphone')]//ancestor::table"));
		System.out.println("Table Name.."+table.getAttribute("id"));
	}
		
	}

  }
