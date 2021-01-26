package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import ressources.WDControler;

public class LoginTest extends WDControler{
	public WebDriver driver;
	
	@Test
	public void seConnecter() {
		driver = init();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().sendKeys("Admin");
		lp.enterPSW().sendKeys("admin123");
		lp.LogIn().click();
		HomePage hpage =  new HomePage(driver);
		hpage.clickWelcome().click();
		hpage.logout().click();
		driver.quit();
	}
}
