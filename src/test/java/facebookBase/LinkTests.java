package facebookBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class LinkTests extends BaseTest {
	
		@BeforeMethod(groups="Smoke")
		public void initializeTest() {
			openApplication();
			
		}
		@Test (priority=0)
		public void messengerLinkTest () {
			driver.findElement(By.linkText("Messenger")).click();
			
			String actualTitle= "Messenger";
			String expectedTitle= driver.getTitle();
			
			System.out.println(" Developers title is " +expectedTitle);
			Assert.assertEquals(expectedTitle, actualTitle, " Reasons for failing>>");
			
			
		}
		
		
		@Test (priority=1)
		public void espanolLinkTest () {
			driver.findElement(By.linkText("Español")).click();
			
			String actualTitle= "Facebook - Inicia sesión o regístrate";
			String expectedTitle= driver.getTitle();
			
			System.out.println(" Developers title is " +expectedTitle);
			Assert.assertEquals(expectedTitle, actualTitle, " Reasons for failing>>");
			
			
		}

		
		
		
		@AfterMethod (groups="Smoke")
		void tearDownTest() {
			closeApplication();
			
		}
		
}

	
