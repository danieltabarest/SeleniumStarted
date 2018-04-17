package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirtsTest {

	public WebDriver driver ;
		
	@Test
	public void LauchFirstTest()
	{
		//Se inicializa la libreria de gecko driver.
		System.setProperty("webdriver.gecko.driver", "C:/Users/Daniel/Downloads/geckodriver/geckodriver.exe");
	     driver = new FirefoxDriver();	
		 driver.get("https://www.youtube.com/");
		  WebElement searchitem = driver.findElement(By.name("search_query"));
		  searchitem.sendKeys("Pastor Lopez");
		  WebElement Buttonitem = driver.findElement(By.id("search-icon-legacy"));
		  Buttonitem.click();
		  
	}

}
