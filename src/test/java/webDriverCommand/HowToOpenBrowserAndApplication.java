package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HowToOpenBrowserAndApplication {

	@Test	
	public void openApplicationWithChrome () {
		//how to open a browser
		WebDriver driver = new ChromeDriver();
		//how to open application
		driver.get("https://www.facebook.com/");
		//how do you close a browser
		driver.close();
	}
	
	@Test
	public void openApplicationWithEdge () {
		//how to open a browser with edge
		WebDriver driver = new EdgeDriver();
		//how to open application
		driver.get("https://www.youtube.com/");
		//how do you close a browser
		driver.close();
	
	}
	
	
	@Test
	public void openApplicationWithFirefox () {
		//how to open a browser with edge
		WebDriver driver = new FirefoxDriver();
		//how to open application
		driver.get("https://www.youtube.com/");
		//how do you close a browser
		driver.close();
	}
}
