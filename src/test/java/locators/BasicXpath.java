package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class BasicXpath extends BaseTestWithIfAndElse {
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	@Test
	public void xPathFormula() {
		//tag[@attribute='value']
		//input[@id='email']
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("schsj");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dskvsn");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@Test
	public void linkXpath() {
		driver.findElement(By.xpath("//a[@title='Spanish']")).click();
	}
	
	
	@AfterTest
	public void closeFacebook() {
		closeApplication();
	
}
}
