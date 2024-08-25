package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class XpathLoop extends BaseTestWithIfAndElse {
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}	
	@Test
	public void xPathLoopTest() {
		
driver.findElement(By.xpath("//div[@id='pageFooter']ul/li[2]")).click();	
	}
		
	public void xPathIndexTest() {
		
	}
	
	
		
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	
}
}
