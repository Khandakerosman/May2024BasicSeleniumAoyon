package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@BeforeMethod (groups="Smoke")
	public void initializeTest() {
		openApplication();
		
	}
	
	
	@Test (priority=0, groups="smoke")
	private void validloginTest() {
		driver.findElement(By.name("email")).sendKeys("asdndn@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jdkscn");
		driver.findElement(By.name("login")).click();
		
		String actualTitle= "Log into Facebook";
		String expectedTitle= driver.getTitle();
		System.out.println(" Developers Title: " +expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Reason for failing>>");
		
	}
	
	@Test(priority=1)
	private void invalidloginTest() {
		driver.findElement(By.name("email")).sendKeys("cscxxz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jdkscn");
		driver.findElement(By.name("login")).click();
		
		String actualTitle= "Log into Facebook";
		String expectedTitle= driver.getTitle();
		System.out.println(" Developers Title: " +expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Reason for failing>>");
		
	}
	
	
	
	@AfterMethod (groups="Smoke")
	void tearDownTest() {
		closeApplication();
		
	}
	
}
