package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class FacebookLinkss extends BaseTestWithIfAndElse {
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
		}
	@Test
	public void linkTest() {
		List<WebElement>links= driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		System.out.println("how many links : "+links.size());	
		Assert.assertEquals(links.size(),33,"Link size does not match" );
		
		for (int i = 0; i <= links.size(); i++) {
			System.out.println(links.get(i).getText());
					
		}
		
	
	}
	@Test
	public void specificLinkTest() {
		List<WebElement> languagesLink=driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
		for (int i = 0; i < languagesLink.size(); i++) {
			String languageName =languagesLink.get(i).getText();
			System.out.println(languageName);
			
			if (languageName.equalsIgnoreCase("Italiano")) {
				languagesLink.get(i).click();
			}
			
			
		}
	}
		
	
	@AfterTest
	public void closeFacebook() {
		//closeApplication();
		
	}



}
