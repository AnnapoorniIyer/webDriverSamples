package testScripts;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	WebDriver driver;
	@Test
	public void test() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    //driver.get("https://the-internet.herokuapp.com/login");
	//WebElement url=driver.findElement(By.xpath("//input[@id='username']"));
	//url.sendKeys("tomsmith");
	//WebElement url1=driver.findElement(By.id("password"));
	//url1.sendKeys("SuperSecretPassword");
	//driver.findElement(By.className("radius")).click();
	//driver.findElement(By.linkText("Elemental Selenium")).click();
	//driver.findElement(By.partialLinkText("Elemental")).click();
		
	
	}
	

}
