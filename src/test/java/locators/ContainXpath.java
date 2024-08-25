package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class ContainXpath extends BaseTestWithIfAndElse {
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}	
	@Test
	public void containMethod() {
		driver.findElement(By.xpath("//a[contains(text(),'Español')]")).click();
		
	}	
	@Test
	public void partialContainTextMethod() {
		WebElement connectFriend=driver.findElement(By.xpath("//h2[contains(text(),'connect with')]"));
		
	}
	
	
		
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	
}
}
