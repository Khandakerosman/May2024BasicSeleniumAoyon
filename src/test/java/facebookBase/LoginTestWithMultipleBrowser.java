package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithMultipleBrowser extends BaseTestWithIfAndElse{
	
	@BeforeMethod
	public void openTest() {
		openApplication();
		
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.name("email")).sendKeys("asdndn@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jdkscn");
		driver.findElement(By.name("login")).click();
		
		String actualTitle= "Log into Facebook";
		String expectedTitle= driver.getTitle();
		System.out.println(" Developers Title: " +expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Reason for failing>>");
		
		
	}
	@AfterMethod
	public void closeTest() {
		closeApplication();
		
		
	}
}
