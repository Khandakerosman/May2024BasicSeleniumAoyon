package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DynamicXpath extends BaseTestWithIfAndElse {
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}	
	
	@Test
	public void userNameTest() {
		
		driver.findElement(By.xpath("//*[contains@class,'inputtext')]")).sendKeys("dsjdcs");
		
	}
	
	@Test
	public void dynamicXpathFormula() {
		driver.findElement(By.xpath("//*[contains@class,'inputtext')]")).sendKeys("dsjdcs");

	}
	@Test
	public void containFunction() {
		
		driver.findElement(By.xpath("//*[contains@id,'u_0_5_')]")).click();
		
	}
		
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	
}
}
