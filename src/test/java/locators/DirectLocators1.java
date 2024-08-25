package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DirectLocators1 extends BaseTestWithIfAndElse {
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void logingTest() {
		driver.findElement(By.id("email")).sendKeys("lkkedjlk");
		driver.findElement(By.name("login")).click();
	}
	
	public void linkTest() {
		/* link test starts with <a href
		 * <Español>
		 */
		
		driver.findElement(By.linkText("Español")).click();
		
	}
	@Test
	public void partialLinkTest() {
		/* link test starts with <a href
		 * <Español>
		 * if link is too long
		 * if link is compound
		 * 		space in between
		 * 		special character
		 * 		number in between
		 * 		underscore in between
		 * if link is dynamic
		 */ 
		
		driver.findElement(By.partialLinkText("Contact")).click();
	}
	
	@Test
	public void classAttributeTest() {
	WebElement text=driver.findElement(By.className("_8eso"));
	System.out.println("what is text : "+text.getText());	
	}
	
	@AfterTest
	public void closeFacebook() {
		closeApplication();

	}

}
