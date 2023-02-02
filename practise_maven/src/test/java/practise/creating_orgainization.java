package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class creating_orgainization {
	@Test
	public void org()
	{     WebDriver driver;
		  String Browser = System.getProperty("browser");
		  String url = System.getProperty("ur");
		  String name = System.getProperty("search");
		  
		  // String Browser = System.getProperty("browser");
	       
	       // property_utility fi = new property_utility();
			
			//String Browser =  fi.properkey("browser");
			  
			
			  
			  if(Browser.equalsIgnoreCase("chrome"))
			  {
				   WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
			  }
			  else if(Browser.equalsIgnoreCase("firefox"))
			  {
				   WebDriverManager.firefoxdriver().setup();
				   driver = new FirefoxDriver();
			  }
			  else if(Browser.equalsIgnoreCase("edge"))
			  { 
				  WebDriverManager.edgedriver().setup();
				  driver = new EdgeDriver();
				  
				  
			  }
			  else
			  {
				  driver = new ChromeDriver();
			  }
			  
			  
			  driver.get(url);
			  
			  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(name);
		}		  
	}


